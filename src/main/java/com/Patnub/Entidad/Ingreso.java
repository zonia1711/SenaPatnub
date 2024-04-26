package com.Patnub.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Crear tablas
@Entity
@Table(name="Ingreso")
public class Ingreso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name= "usuario")
	private String usuario;
	
	@Column(name="contraseña")
	private String contraseña;

	//Constructores
	public Ingreso(Long id, String usuario, String contraseña) {
		super();
		Id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Ingreso(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	
	//geter and seterd
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	//ToString
	@Override
	public String toString() {
		return "Ingreso [Id=" + Id + ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}

	//Constructor vacio
	public Ingreso() {
		super();
	}

}
