package model;

public class Promocao {

	private int idPacote;
	private String nomePacote;
	private String observacao;
	private double percentual;

	public Promocao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promocao(int idPacote, String nomePacote, String observacao, double percentual) {
		this.idPacote = idPacote;
		this.nomePacote = nomePacote;
		this.observacao = observacao;
		this.percentual = percentual;
	}

	public int getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(int idPacote) {
		this.idPacote = idPacote;
	}

	public String getNomePacote() {
		return nomePacote;
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

}
