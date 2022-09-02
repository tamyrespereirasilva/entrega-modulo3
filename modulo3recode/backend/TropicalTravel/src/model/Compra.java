package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra
{
	private int id_compra;
	private LocalDate data_compra;
	private double valor_compra;

	private Usuario usuario;
	private Passagem passagem;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Compra() {
		
	}
	
	public Compra(int id_compra, LocalDate data_compra, double valor_compra, Usuario usuario, Passagem passagem,
			DateTimeFormatter formatter) {
		super();
		this.id_compra = id_compra;
		this.data_compra = data_compra;
		this.valor_compra = valor_compra;
		this.usuario = usuario;
		this.passagem = passagem;
		this.formatter = formatter;
	}



	public void formaPagamento() {
	
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public String getData_compra() {
		return formatter.format(data_compra);
	}

	public void setData_compra(String data_compra) {
		this.data_compra = LocalDate.parse(data_compra, formatter);
	}

	public double getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(double valor_compra) {
		this.valor_compra = valor_compra;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

	
}

