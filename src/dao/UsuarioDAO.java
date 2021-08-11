package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Usuario;

import java.sql.ResultSet;

public class UsuarioDAO {

	private Connection conexao = null;

	public UsuarioDAO() {

	}
	
	// Método de consulta usuario
	public boolean consultaUsuarioExiste(String usuario) {
		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();
				
		String sql = "select * from usuario where usuario = ?";
				
		PreparedStatement prepS;
				
		try {
			prepS = conexao.prepareStatement(sql);
			prepS.setString(1, usuario);
			ResultSet res = prepS.executeQuery();
					
			if (res.next()) {
				conexao.close();
				return true;
			} else {
				conexao.close();
				return false;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			try {
				conexao.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}
	
	// Método de consulta de senha valida
	public boolean consultaUsuarioSenha(Usuario usuario) {	
		String senha = null;
			
		ConexaoMySQL.abrirConexao();
		conexao = ConexaoMySQL.getCon();
			
		String sql = "select * from usuario where usuario = ?";
			
		PreparedStatement prepS;
			
		try {
			prepS = conexao.prepareStatement(sql);
			prepS.setString(1, usuario.getUsuario());
			ResultSet res = prepS.executeQuery();
				
			while (res.next()) {
				senha = res.getString(2);
			}
				
			conexao.close();
				
			if(usuario.getSenha().equals(senha)) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
			try {
				conexao.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			return false;
		}
	}
}
