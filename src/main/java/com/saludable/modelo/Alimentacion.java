package com.saludable.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "comidas")
public class Alimentacion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	private int id;
	
	@Column
	private String dni;
	@Column
	private String tipoDeComida;
	@Column
	private String comidaPrincipal;
	@Column
	private String comidaSecundaria;
	@Column
	private String bebida;
	@Column
	private String ingirioPostre;
	@Column
	private String tentacionMasAlimento;
	@Column
	private String quedoConHamnre;
	@Column
	private String fechaCargaSistema;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTipoDeComida() {
		return tipoDeComida;
	}
	public void setTipoDeComida(String tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}
	public String getComidaPrincipal() {
		return comidaPrincipal;
	}
	public void setComidaPrincipal(String comidaPrincipal) {
		this.comidaPrincipal = comidaPrincipal;
	}
	public String getComidaSecundaria() {
		return comidaSecundaria;
	}
	public void setComidaSecundaria(String comidaSecundaria) {
		this.comidaSecundaria = comidaSecundaria;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getIngirioPostre() {
		return ingirioPostre;
	}
	public void setIngirioPostre(String ingirioPostre) {
		this.ingirioPostre = ingirioPostre;
	}
	public String getTentacionMasAlimento() {
		return tentacionMasAlimento;
	}
	public void setTentacionMasAlimento(String tentacionMasAlimento) {
		this.tentacionMasAlimento = tentacionMasAlimento;
	}
	public String getQuedoConHamnre() {
		return quedoConHamnre;
	}
	public void setQuedoConHamnre(String quedoConHamnre) {
		this.quedoConHamnre = quedoConHamnre;
	}
	public int getId() {
		return id;
	}
	public String getFechaCargaSistema() {
		return fechaCargaSistema;
	}
	
	
	
	
	
	
	
}
