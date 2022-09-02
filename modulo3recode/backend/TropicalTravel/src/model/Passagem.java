package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passagem
{
	
	private int id_passagem;
    private String nome_passageiro;
	private LocalDate data_ida;
	
	
	private Usuario usuario;
	private Destinos destinos;
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Passagem() {
		
	}

	
	public Passagem(int id_passagem, String nome_passageiro, LocalDate data_ida, Usuario usuario, Destinos destinos,
			DateTimeFormatter formatter) {
		super();
		this.id_passagem = id_passagem;
		this.nome_passageiro = nome_passageiro;
		this.data_ida = data_ida;
		this.usuario = usuario;
		this.destinos = destinos;
		this.formatter = formatter;
	}

	public void verificarPassagem() {
			
	}
	
	public void checkIn() {
		
	}


	public int getId_passagem() {
		return id_passagem;
	}


	public void setId_passagem(int id_passagem) {
		this.id_passagem = id_passagem;
	}


	public String getNome_passageiro() {
		return nome_passageiro;
	}


	public void setNome_passageiro(String nome_passageiro) {
		this.nome_passageiro = nome_passageiro;
	}


	public String getData_ida() {
		return formatter.format(data_ida);
	}


	public void setData_ida(String data_ida) {
		this.data_ida = LocalDate.parse(data_ida, formatter);
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Destinos getDestinos() {
		return destinos;
	}


	public void setDestinos(Destinos destinos) {
		this.destinos = destinos;
	}

}

