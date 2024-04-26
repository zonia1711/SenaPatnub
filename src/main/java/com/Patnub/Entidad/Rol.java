package com.Patnub.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdRol;
	
	@Column(name ="nombre")
	private String nombre ; 
	
	@Column(name ="descripcion")
	private String descripcion ;

	//Constructores
	public Rol(Long idRol, String nombre, String descripcion) {
		super();
		IdRol = idRol;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Rol(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	//Getters and Setters
	public Long getIdRol() {
		return IdRol;
	}

	public void setIdRol(Long idRol) {
		IdRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Rol [IdRol=" + IdRol + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	//Constructor vasio
	public Rol() {
		super();
	} 
	
	
}
