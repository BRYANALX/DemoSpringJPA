package com.bryanalexandercd.dto;

import java.io.Serializable;

public class BienvenidaResponse implements Serializable {

	private String saludo;
	private String usuario;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
