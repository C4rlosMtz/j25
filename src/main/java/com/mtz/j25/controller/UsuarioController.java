package com.mtz.j25.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.j25.dto.UsuarioDto;
import com.mtz.j25.dto.UsuarioReporteVo;
import com.mtz.j25.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("usuarios")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@GetMapping("{idUsuario}")
	public ResponseEntity<UsuarioDto> obtenerUsuario(@PathVariable int idUsuario) {
		return ResponseEntity.ok(usuarioService.obtenerUsuario(idUsuario));
	}

	@GetMapping("{idUsuario}/reporte")
	public ResponseEntity<UsuarioReporteVo> obtenerUsuarioReporte(@PathVariable int idUsuario) {
		return ResponseEntity.ok(usuarioService.obtenerUsuarioReporte(idUsuario));
	}

}
