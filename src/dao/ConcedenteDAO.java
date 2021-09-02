package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import exceptions.DataBaseException;
import modelo.Concedente;
import modelo.Curso;

public class ConcedenteDAO {

	public ConcedenteDAO() {
		super();
	}

	private Connection conexao = null;

	public Optional<Concedente> consultaPorCNPJ(String cnpj) throws SQLException {

		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();

		String selectQuery = "select cnpj, razao_social, nome_repre from concedente where cnpj = ?;";

		try (PreparedStatement preparedStatement = conexao.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, cnpj);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next()) {
				return Optional.empty();
			}

			return Optional.of(new Concedente(resultSet.getString("cnpj"), resultSet.getString("razao_social"),
					resultSet.getString("nome_repre")));

		} catch (SQLException e) {
			throw new DataBaseException("Houve um problema ao procurar o elemento", e);
		} finally {
			conexao.close();
		}
	}

}
