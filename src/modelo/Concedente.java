package modelo;

public class Concedente {
	
	public Concedente() {
		super();
	}
	
	private String razaoSocial;
	private String cnpj;
	private String telConcedente;
	private String nomeRepre;
	private String cargoRepre;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Concedente(String cnpj, String razaoSocial, String nomeRepre) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeRepre = nomeRepre;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelConcedente() {
		return telConcedente;
	}
	public void setTelConcedente(String telConcedente) {
		this.telConcedente = telConcedente;
	}
	public String getNomeRepre() {
		return nomeRepre;
	}
	public void setNomeRepre(String nomeRepre) {
		this.nomeRepre = nomeRepre;
	}
	public String getCargoRepre() {
		return cargoRepre;
	}
	public void setCargoRepre(String cargoRepre) {
		this.cargoRepre = cargoRepre;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
	
	

	
}
