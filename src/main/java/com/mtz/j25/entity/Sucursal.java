package com.mtz.j25.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Sucursal")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = -1536090642718763986L;

	@Id
	@Column(name = "IdSucursal")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSucursal;

	@Column(name = "Siglas")
	private String siglas;

}
