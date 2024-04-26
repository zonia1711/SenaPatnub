package com.Patnub.Entidad;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

//Create Table
@Entity
@Table(name = "Clientes")
public class RegistroClientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ClienteID;

	
	@Column(name = "Nombre", nullable = false, length = 50)
	private String Nombre;

	@Column(name = "Apellido", nullable = false, length = 50)
	private String Apellido;

	@Column(name = "Telefono")
	private String Telefono;

	@Column(name = "Email", nullable = false, length = 50)
	private String Email;

	@Column(name = "Contrasena", nullable = false, length = 100)
	private String Contrasena;

	// Constructores

	public RegistroClientes(Long ClienteID, String nombre, String apellido, String telefono, String email,
			String Contrasena) {
		super();
		this.ClienteID = ClienteID;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		Email = email;
		this.Contrasena = Contrasena;
	}

	public RegistroClientes() {
		super();
	}

	// Getters y Setters
	public Long getClienteID() {
		return ClienteID;
	}

	public void setId(Long id, Long ClienteID) {
		this.ClienteID = ClienteID;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String Contrasena) {
		this.Contrasena = Contrasena;
	}

//toString
	@Override
	public String toString() {
		return "RegistroClientes [ClienteID=" + ClienteID + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", Telefono=" + Telefono + ", Email=" + Email + ", Contrasena=" + Contrasena + "]";
	}

	public static void save(RegistroClientes clientes) {
		// TODO Auto-generated method stub

	}
}
