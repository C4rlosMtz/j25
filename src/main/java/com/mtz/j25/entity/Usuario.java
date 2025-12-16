package com.mtz.j25.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = -8965333096626454318L;

	@Id
	@Column(name = "idUsuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;

	@Column(name = "usuario")
	private String usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSucursal")
	private Sucursal sucursal;

}
