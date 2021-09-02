package modelo;

public class Estagiario {
	
	public Estagiario() {
		super();
	}
	
	
	public Estagiario(String cpf, String nome, String genero, String dataNasc, String telCelular, String telCasa,
			String cep, String endereco, String bairro, String cidade, String curso, String dataIngresso) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.genero = genero;
		this.dataNasc = dataNasc;
		this.telCelular = telCelular;
		this.telCasa = telCasa;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.curso = curso;
		this.dataIngresso = dataIngresso;
	}



	private String cpf;
	private String nome;
	private String genero;
	private String dataNasc; // tem que ver se vai ser compativel
	private String telCelular;
	private String telCasa;
	private String cep;
	private String endereco;
	private String bairro;
	private String cidade;
	private String curso;
	private String dataIngresso; // tem que ver se vai ser compativel
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	public String getTelCasa() {
		return telCasa;
	}
	public void setTelCasa(String telCasa) {
		this.telCasa = telCasa;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	
	
	

}
