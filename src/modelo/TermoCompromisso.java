package modelo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TermoCompromisso {
	
	private Integer codTermo;
	private Date inicioEstagio;
	private Date fimEstagio;
	private Integer chDiaria;
	private Integer chSemanal;
	private String areaEstagio;
	private Time inicioAtividades;
	private Time fimAtividades;
	private String atividades;
	private Double valorBolsa;
	private Double beneficios;
	private String cpfAluno;
	private String codCurso;
	private String cnpjEmpresa;
	private String infoComplementar;
	
	public TermoCompromisso() {
		super();
	}

	public TermoCompromisso(Integer codTermo, Date inicioEstagio, Date fimEstagio, Integer chDiaria,
			Integer chSemanal, String areaEstagio, Time inicioAtividades, Time fimAtividades,
			String atividades, Double valorBolsa, Double beneficios, String cpfAluno, String codCurso,
			String cnpjEmpresa, String infoComplementar) {
		super();
		this.codTermo = codTermo;
		this.inicioEstagio = inicioEstagio;
		this.fimEstagio = fimEstagio;
		this.chDiaria = chDiaria;
		this.chSemanal = chSemanal;
		this.areaEstagio = areaEstagio;
		this.inicioAtividades = inicioAtividades;
		this.fimAtividades = fimAtividades;
		this.atividades = atividades;
		this.valorBolsa = valorBolsa;
		this.beneficios = beneficios;
		this.cpfAluno = cpfAluno;
		this.codCurso = codCurso;
		this.cnpjEmpresa = cnpjEmpresa;
		this.infoComplementar = infoComplementar;
	}

	
	
	public TermoCompromisso(Date inicioEstagio, Date fimEstagio, Integer chDiaria, Integer chSemanal,
			String areaEstagio, Time inicioAtividades, Time fimAtividades, String atividades, Double valorBolsa,
			Double beneficios, String cpfAluno, String codCurso, String cnpjEmpresa, String infoComplementar) {
		super();
		this.inicioEstagio = inicioEstagio;
		this.fimEstagio = fimEstagio;
		this.chDiaria = chDiaria;
		this.chSemanal = chSemanal;
		this.areaEstagio = areaEstagio;
		this.inicioAtividades = inicioAtividades;
		this.fimAtividades = fimAtividades;
		this.atividades = atividades;
		this.valorBolsa = valorBolsa;
		this.beneficios = beneficios;
		this.cpfAluno = cpfAluno;
		this.codCurso = codCurso;
		this.cnpjEmpresa = cnpjEmpresa;
		this.infoComplementar = infoComplementar;
	}

	public Integer getCodTermo() {
		return codTermo;
	}

	public void setCodTermo(Integer codTermo) {
		this.codTermo = codTermo;
	}

	public Date getInicioEstagio() {
		return inicioEstagio;
	}

	public void setInicioEstagio(Date inicioEstagio) {
		this.inicioEstagio = inicioEstagio;
	}

	public Date getFimEstagio() {
		return fimEstagio;
	}

	public void setFimEstagio(Date fimEstagio) {
		this.fimEstagio = fimEstagio;
	}

	public Integer getChDiaria() {
		return chDiaria;
	}

	public void setChDiaria(Integer chDiaria) {
		this.chDiaria = chDiaria;
	}

	public Integer getChSemanal() {
		return chSemanal;
	}

	public void setChSemanal(Integer chSemanal) {
		this.chSemanal = chSemanal;
	}

	public String getAreaEstagio() {
		return areaEstagio;
	}

	public void setAreaEstagio(String areaEstagio) {
		this.areaEstagio = areaEstagio;
	}

	public Time getInicioAtividades() {
		return inicioAtividades;
	}

	public void setInicioAtividades(Time inicioAtividades) {
		this.inicioAtividades = inicioAtividades;
	}

	public Time getFimAtividades() {
		return fimAtividades;
	}

	public void setFimAtividades(Time fimAtividades) {
		this.fimAtividades = fimAtividades;
	}

	public String getAtividades() {
		return atividades;
	}

	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}

	public Double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(Double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public Double getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(Double beneficios) {
		this.beneficios = beneficios;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getInfoComplementar() {
		return infoComplementar;
	}

	public void setInfoComplementar(String infoComplementar) {
		this.infoComplementar = infoComplementar;
	}
		

}
