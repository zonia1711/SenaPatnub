package com.Patnub.Entidad;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Reserva")

public class Reserva {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "id_reserva", insertable = false, updatable = false)
	private Long idReserva;

	@Column(name = "ClienteID", insertable = false, updatable= false)
	private String ClienteID;

	
	@Column(name = "servicio")
	private String servicio;
	

	@Column(name = "fecha")
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@Column(name = "estilista")
	private String estilista;

	@Column(name = "hora")
    @DateTimeFormat(pattern = "HH:mm:ss")
	private Time hora;

	private Long id_reserva;

// Constructores
	public Reserva(String clienteID, String nombre, String servicio, Date fecha, String estilista,
			Time hora, Long id_reserva) {
		super();
		ClienteID = clienteID;
		this.servicio = servicio;
		this.fecha = fecha;
		this.estilista = estilista;
		this.hora = hora;
		this.id_reserva = id_reserva;
	}

public Reserva(Long idReserva, String clienteID,  String servicio, Date fecha, String estilista,
	 Time hora, Long id_reserva) {
	super();
	this.idReserva = idReserva;
	ClienteID = clienteID;
	this.servicio = servicio;
	this.fecha = fecha;
	this.estilista = estilista;
	this.hora = hora;
	this.id_reserva = id_reserva;
}

// geter and seterd
	

public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public String getClienteID() {
		return ClienteID;
	}

	public void setClienteID(String clienteID) {
		ClienteID = clienteID;
	}



	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstilista() {
		return estilista;
	}

	public void setEstilista(String estilista) {
		this.estilista = estilista;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Long getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(Long id_reserva) {
		this.id_reserva = id_reserva;
	}

	// Constructor vacio
	public Reserva() {
		super();
	}

	public List<Reserva> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva save(Reserva reserva) {
		// TODO Auto-generated method stub
		return null;
	}
	//ToString
	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", ClienteID=" + ClienteID +  ", servicio="
				+ servicio + ", fecha=" + fecha + ", estilista=" + estilista + ", estado_reserva=" + ", hora=" + hora + ", id_reserva=" + id_reserva + "]";
	}
}