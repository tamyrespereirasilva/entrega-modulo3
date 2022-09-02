package model;

public class Destinos
{
	private int id_destino;
	private String nome_destino;
	
	public Destinos() {
		
	}
	
	public Destinos(int id_destino, String nome_destino) {
		super();
		this.id_destino = id_destino;
		this.nome_destino = nome_destino;
	}

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public String getNome_destino() {
		return nome_destino;
	}

	public void setNome_destino(String nome_destino) {
		this.nome_destino = nome_destino;
	}
	
	
}

