package com.example.mongoproyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cuenta")
public class CuentaModel {
	@Id
	private int id;
	
	private String nombreDeLaCuenta;
	private String banco;
	private String tipo;
	private float monto;
	private int idusuario;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setNombreDeLaCuenta(String nombreDeLaCuenta) {
		this.nombreDeLaCuenta=nombreDeLaCuenta;
	}
	public String getNombreDeLaCuenta() {
		return this.nombreDeLaCuenta;
	}
	public void setBanco(String banco) {
		this.banco=banco;
	}
	public String getBanco() {
		return this.banco;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setMonto(float monto) {
		this.monto=monto;
	}
	public float getMonto() {
		return this.monto;
	}
	public void setIdusuario(int idUsuario) {
		this.idusuario=idUsuario;
	}
	public int getIdusuario() {
		return this.idusuario;
	}
	/*
	public CuentaModel(int id, String nombreDeLaCuenta, String banco,String tipo, float monto, int idUsuario) {
		super();
		this.id=id;
		this.nombreDeLaCuenta=nombreDeLaCuenta;
		this.banco=banco;
		this.tipo=tipo;
		this.monto=monto;
		this.idUsuario=idUsuario;
	}*/
	
}
