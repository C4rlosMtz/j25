package com.mtz.j25.mapper;

import com.mtz.j25.dto.UsuarioDto;
import com.mtz.j25.entity.Usuario;

public final class UsuarioMapper {

	private UsuarioMapper() {
		// Private constructor to prevent instantiation of the utility class
	}

	public static UsuarioDto mapToUsuarioDto(Usuario u) {
		return UsuarioDto.builder().idUsuario(u.getIdUsuario()).usuario(u.getUsuario()).build();
	}

}
