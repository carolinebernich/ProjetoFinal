package modelo;

import sun.rmi.server.UnicastRef;

public class Curso {
	
	private String codCurso;
	private String nomeCurso;
	private String telCoordenacao;
	private String repreCoordenacao;
	private String cargoRepreCoordenacao;
	private String nomeUniversidade;
	private String cnpj;
	private String cep;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String telUniversidade;
	private String repreUniversidade;
	private String cargoRepreUniversidade;
	
	public Curso() {
		super();
	}

	public Curso(String codCurso, String nomeCurso, String telCoordenacao, String repreCoordenacao,
			String cargoRepreCoordenacao, String nomeUniversidade, String cnpj, String cep, String endereco,
			String bairro, String cidade, String estado, String telUniversidade, String repreUniversidade,
			String cargoRepreUniversidade) {
		super();
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
		this.telCoordenacao = telCoordenacao;
		this.repreCoordenacao = repreCoordenacao;
		this.cargoRepreCoordenacao = cargoRepreCoordenacao;
		this.nomeUniversidade = nomeUniversidade;
		this.cnpj = cnpj;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telUniversidade = telUniversidade;
		this.repreUniversidade = repreUniversidade;
		this.cargoRepreUniversidade = cargoRepreUniversidade;
	}
	
	public Curso(String codCurso, String nomeCurso, String repreCoordenacao, String nomeUniversidade, String repreUniversidade) {
		super();
		this.codCurso = codCurso;
		this.nomeCurso = nomeCurso;
		this.repreCoordenacao = repreCoordenacao;
		this.nomeUniversidade = nomeUniversidade;
		this.repreUniversidade = repreUniversidade;
		
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getTelCoordenacao() {
		return telCoordenacao;
	}

	public void setTelCoordenacao(String telCoordenacao) {
		this.telCoordenacao = telCoordenacao;
	}

	public String getRepreCoordenacao() {
		return repreCoordenacao;
	}

	public void setRepreCoordenacao(String repreCoordenacao) {
		this.repreCoordenacao = repreCoordenacao;
	}

	public String getCargoRepreCoordenacao() {
		return cargoRepreCoordenacao;
	}

	public void setCargoRepreCoordenacao(String cargoRepreCoordenacao) {
		this.cargoRepreCoordenacao = cargoRepreCoordenacao;
	}

	public String getNomeUniversidade() {
		return nomeUniversidade;
	}

	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelUniversidade() {
		return telUniversidade;
	}

	public void setTelUniversidade(String telUniversidade) {
		this.telUniversidade = telUniversidade;
	}

	public String getRepreUniversidade() {
		return repreUniversidade;
	}

	public void setRepreUniversidade(String repreUniversidade) {
		this.repreUniversidade = repreUniversidade;
	}

	public String getCargoRepreUniversidade() {
		return cargoRepreUniversidade;
	}

	public void setCargoRepreUniversidade(String cargoRepreUniversidade) {
		this.cargoRepreUniversidade = cargoRepreUniversidade;
	}
	
}
