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
public class UsuarioDto implements Serializable {
	private static final long serialVersionUID = -696462416612598678L;

	private Integer idUsuario;
	private String usuario;

}
