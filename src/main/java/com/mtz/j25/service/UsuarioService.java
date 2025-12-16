package com.mtz.j25.service;

import com.mtz.j25.dto.UsuarioDto;
import com.mtz.j25.dto.UsuarioReporteVo;

public interface UsuarioService {

	UsuarioDto obtenerUsuario(int idUsuario);

	UsuarioReporteVo obtenerUsuarioReporte(int idUsuario);

}
