package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import exceptions.DataBaseException;
import modelo.Estagiario;

public class EstagiarioDAO {

	public EstagiarioDAO() {
		super();
	}

	private Connection conexao = null;

	public Optional<Estagiario> consultaPorCpf(String cpf) throws SQLException {

		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();

		String selectQuery = "select * from estagiario where cpf = ?";

		try (PreparedStatement preparedStatement = conexao.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, cpf);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next()) {
				return Optional.empty();
			}

			return Optional.of(new Estagiario(resultSet.getString("cpf"), resultSet.getString("nome"),
					resultSet.getString("genero"), resultSet.getString("data_nascimento"),
					resultSet.getString("tel_celular"), resultSet.getString("tel_casa"), resultSet.getString("cep"),
					resultSet.getString("endereco"), resultSet.getString("bairro"), resultSet.getString("cidade"),
					resultSet.getString("cod_curso"), resultSet.getString("data_ingresso")));

		} catch (SQLException e) {
			throw new DataBaseException("Houve um problema ao procurar o elemento", e);
		} finally {
			conexao.close();
		}
	}
}