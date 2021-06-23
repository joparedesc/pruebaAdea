package com.adea.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="USUARIO")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4004829838262385505L;
	@Id
	@Column(length = 20)
	private String login;
	
	@Column(nullable = false,length = 100)
	private String password;
	@Column(nullable = false,length = 20)
	private String nombre;
	/*
	@Column(nullable = false)
	private float cliente;
	@Column(length = 50)
	private String email;
	@Column(nullable = false)
	private LocalDate fechaAlta;
	private LocalDate fechaBaja;
	@Column(nullable = false)
	private int status;
	@Column(nullable = false)
	private float intentos;
	private LocalDate fechaRevocado;
	private LocalDate fechaVigencia;
	private int noAcceso;
	@Column(length = 50)
	private String apellidoPaterno;
	@Column(length = 50)
	private String apellidoMaterno;
	private int area;
	@Column(nullable = false)
	private LocalDate fechaModificacion;
	*/
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	public float getCliente() {
		return cliente;
	}
	public void setCliente(float cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public LocalDate getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public float getIntentos() {
		return intentos;
	}
	public void setIntentos(float intentos) {
		this.intentos = intentos;
	}
	public LocalDate getFechaRevocado() {
		return fechaRevocado;
	}
	public void setFechaRevocado(LocalDate fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}
	public LocalDate getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(LocalDate fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public int getNoAcceso() {
		return noAcceso;
	}
	public void setNoAcceso(int noAcceso) {
		this.noAcceso = noAcceso;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}	
	
	*/
}
