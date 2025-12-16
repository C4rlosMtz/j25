package com.mtz.j25.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioReporteVo implements Serializable {
	private static final long serialVersionUID = 5481124254661487667L;

	private Integer idUsuario;
	private String usuario;
	private String siglas;

}
