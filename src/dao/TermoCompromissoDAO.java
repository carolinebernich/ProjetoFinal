package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import exceptions.DataBaseException;
import modelo.Curso;
import modelo.TermoCompromisso;

public class TermoCompromissoDAO {

	public TermoCompromissoDAO() {
		super();
	}

	private Connection conexao = null;

	public boolean cadastrarTermoCompromisso(TermoCompromisso termoCompromisso) throws SQLException {

		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();

		String insert = "INSERT INTO termo_compromisso (inicio_estagio, fim_estagio, ch_diaria, ch_semanal, area_estagio, "
				+ "inicio_atividades, fim_atividades, atividades, valor_bolsa, beneficios, cpf_aluno, cod_curso, cnpj_empresa, "
				+ "info_complementar) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement preparedStatement = (conexao.prepareStatement(insert))) {
			preparedStatement.setDate(1, termoCompromisso.getInicioEstagio());
			preparedStatement.setDate(2, termoCompromisso.getFimEstagio());
			preparedStatement.setInt(3, termoCompromisso.getChDiaria());
			preparedStatement.setInt(4, termoCompromisso.getChSemanal());
			preparedStatement.setString(5, termoCompromisso.getAreaEstagio());
			preparedStatement.setTime(6, termoCompromisso.getInicioAtividades());
			preparedStatement.setTime(7, termoCompromisso.getFimAtividades());
			preparedStatement.setString(8, termoCompromisso.getAtividades());
			preparedStatement.setDouble(9, termoCompromisso.getValorBolsa());
			preparedStatement.setDouble(10, termoCompromisso.getBeneficios());
			preparedStatement.setString(11, termoCompromisso.getCpfAluno());
			preparedStatement.setString(12, termoCompromisso.getCodCurso());
			preparedStatement.setString(13, termoCompromisso.getCnpjEmpresa());
			preparedStatement.setString(14, termoCompromisso.getInfoComplementar());

			preparedStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new DataBaseException("Houve um erro ao inserir este termo de compromisso", e);

		} finally {
			conexao.close();
		}
	}

	public Optional<TermoCompromisso> getByCpfAluno(String cpfAluno) throws SQLException {

		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();

		String selectQuery = "select * from termo_compromisso where cpf_aluno = ?;";

		try (PreparedStatement preparedStatement = conexao.prepareStatement(selectQuery)) {
			preparedStatement.setString(1, cpfAluno);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next()) {
				return Optional.empty();
			}

			return Optional.of(new TermoCompromisso(resultSet.getInt("cod_termo"), resultSet.getDate("inicio_estagio"),
					resultSet.getDate("fim_estagio"), resultSet.getInt("ch_diaria"), resultSet.getInt("ch_semanal"),
					resultSet.getString("area_estagio"), resultSet.getTime("inicio_atividades"),
					resultSet.getTime("fim_atividades"), resultSet.getString("atividades"),
					resultSet.getDouble("valor_bolsa"), resultSet.getDouble("beneficios"),
					resultSet.getString("cpf_aluno"), resultSet.getString("cod_curso"),
					resultSet.getString("cnpj_empresa"), resultSet.getString("info_complementar")));

		} catch (SQLException e) {
			throw new DataBaseException("Houve um problema ao procurar o elemento", e);
		} finally {
			conexao.close();
		}
	}
}