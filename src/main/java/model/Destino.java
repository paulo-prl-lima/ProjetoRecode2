package model;

public class Destino {

	private int idDestino;
	private String nome;
	private String nomeHotel;
	private String descricao;
	private int qtdDias;
	private double valor;
	private int idCliente;
	private int idPromocao;

	public Destino() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destino(int idDestino, String nome, String nomeHotel, String descricao, int qtdDias, double valor,
			int idCliente, int idPromocao) {
		this.idDestino = idDestino;
		this.nome = nome;
		this.nomeHotel = nomeHotel;
		this.descricao = descricao;
		this.qtdDias = qtdDias;
		this.valor = valor;
		this.idCliente = idCliente;
		this.idPromocao = idPromocao;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeHotel() {
		return nomeHotel;
	}

	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdPromocao() {
		return idPromocao;
	}

	public void setIdPromocao(int idPromocao) {
		this.idPromocao = idPromocao;
	}

}
