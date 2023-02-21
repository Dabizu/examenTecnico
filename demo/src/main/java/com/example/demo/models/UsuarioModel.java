package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
	private int id;
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private String correo;
	private String telefono;
	private int edad;
	private char sexo;
	private String password;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setApellidopaterno(String apellidoPaterno) {
		this.apellidopaterno=apellidoPaterno;
	}
	public String getApellidopaterno() {
		return this.apellidopaterno;
	}
	public void setApellidomaterno(String apellidoMaterno) {
		this.apellidomaterno=apellidoMaterno;
	}
	public String getApellidomaterno() {
		return this.apellidomaterno;
	}
	
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	public String getCorreo() {
		return this.correo;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public String getTelefono() {return this.telefono;}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {return this.edad;}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public char getSexo() {return this.sexo;}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
}
