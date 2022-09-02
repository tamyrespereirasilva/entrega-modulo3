package model;

import java.time.LocalDate;

public class Usuario
{
	
	private int id_usuario;
	private String nome_usuario;
	private LocalDate data_nasc;
	private String email_usuario;
	private String senha_usuario;
	private String cpf;
	private String rg;
	private int tel_usuario;
	private String endereço;
	
	public Usuario () {
		
	}
	
	public Usuario(int id_usuario, String nome_usuario, LocalDate data_nasc, String email_usuario, String senha_usuario,
			String cpf, String rg, int tel_usuario, String endereço) {
		super();
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.data_nasc = data_nasc;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
		this.cpf = cpf;
		this.rg = rg;
		this.tel_usuario = tel_usuario;
		this.endereço = endereço;
	}



	public Usuario(int id, String nome) {
		
	}


	public void cadastrarUsuario() {
		
	}
	
	
	
	public void alterarSenha() {
			
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getTel_usuario() {
		return tel_usuario;
	}

	public void setTel_usuario(int tel_usuario) {
		this.tel_usuario = tel_usuario;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
}

