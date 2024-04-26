package com.Patnub.Entidad;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Turno")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long turnoID;

	@Column(name = "ClienteID", insertable = false, updatable = false)
	private String clienteID;

	@Column(name = "estilista")
	private String estilista;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "hora")
	private Time hora;

	@Column(name = "servicio")
	private String servicio;

	@Column(name = "precio")
	private String precio;

	// Constructores

	public Turno(Long turnoId, String clienteID, String estilista, Date fecha, Time hora, String servicio,
			String precio, String id_reserva) {
		super();
		this.turnoID = turnoId;
		this.clienteID = clienteID;
		this.estilista = estilista;
		this.fecha = fecha;
		this.hora = hora;
		this.servicio = servicio;
		this.precio = precio;

	}

	public Turno(String clienteID, String estilista, Date fecha, Time hora, String servicio, String precio,
			String id_reserva) {
		super();
		this.clienteID = clienteID;
		this.estilista = estilista;
		this.fecha = fecha;
		this.hora = hora;
		this.servicio = servicio;
		this.precio = precio;

	}

	// geter and seterd
	public Long getTurnoId() {
		return turnoID;
	}

	public void setTurnoId(Long turnoId) {
		this.turnoID = turnoId;
	}

	public String getClienteID() {
		return clienteID;
	}

	public void setClienteID(String clienteID) {
		this.clienteID = clienteID;
	}

	public String getEstilista() {
		return estilista;
	}

	public void setEstilista(String estilista) {
		this.estilista = estilista;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	// ToString
	@Override
	public String toString() {
		return "Turno [turnoId=" + turnoID + ", ClienteID=" + clienteID + ", estilista=" + estilista + ", fecha="
				+ fecha + ", hora=" + hora + ", servicio=" + servicio + ", precio=" + precio + ", id_reserva="
				+ ", getTurnoId()=" + getTurnoId() + ", getClienteID()=" + getClienteID() + ", getEstilista()="
				+ getEstilista() + ", getFecha()=" + getFecha() + ", getHora()=" + getHora() + ", getServicio()="
				+ getServicio() + ", getPrecio()=" + getPrecio() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	// Constructor vacio
	public Turno() {
		super();
	}

}
