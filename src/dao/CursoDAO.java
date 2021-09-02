package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import exceptions.DataBaseException;
import modelo.Curso;
import modelo.Estagiario;

public class CursoDAO {

	public CursoDAO() {
		super();
	}

	private Connection conexao = null;

	public Optional<Curso> consultaPorCpfAluno(String cpfAluno) throws SQLException {

		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();

		String selectQuery = "select curso.cod_curso, nome_curso, repre_coordenacao, nome_universidade, repre_universidade from curso "
				+ "inner join estagiario on curso.cod_curso = estagiario.cod_curso where estagiario.cpf = ?;";

		try (PreparedStatement preparedStatement = conexao.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, cpfAluno);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next()) {
				return Optional.empty();
			}

			return Optional.of(new Curso(resultSet.getString("cod_curso"), resultSet.getString("nome_curso"),
					resultSet.getString("repre_coordenacao"), resultSet.getString("nome_universidade"),
					resultSet.getString("repre_universidade")));

		} catch (SQLException e) {
			throw new DataBaseException("Houve um problema ao procurar o elemento", e);
		} finally {
			conexao.close();
		}
	}

	public Optional<String> getCodCursoByCursoName(String cursoNome) throws SQLException {
		
		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();
		
		String select = "select cod_curso from curso where nome_curso = ?;";
		
		try (PreparedStatement preparedStatement = conexao.prepareStatement(select)) {
			preparedStatement.setString(1, cursoNome);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next()) {
				return Optional.empty();
			}
			
			return Optional.of(resultSet.getString("cod_curso"));

		} catch (SQLException e) {
			throw new DataBaseException("Houve um problema ao procurar o elemento", e);
		} finally {
			conexao.close();
		}
		
	}

}
