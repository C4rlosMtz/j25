package com.mtz.j25.service.impl;

import org.springframework.stereotype.Service;

import com.mtz.j25.dto.UsuarioDto;
import com.mtz.j25.dto.UsuarioReporteVo;
import com.mtz.j25.mapper.UsuarioMapper;
import com.mtz.j25.repository.UsuarioRepository;
import com.mtz.j25.service.UsuarioService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioDto obtenerUsuario(int idUsuario) {
		return usuarioRepository.findById(idUsuario).map(UsuarioMapper::mapToUsuarioDto)
				.orElseThrow(() -> new EntityNotFoundException("User not found: " + idUsuario));
	}

	@Override
	public UsuarioReporteVo obtenerUsuarioReporte(int idUsuario) {
		return usuarioRepository.obtenerUsuarioReporte(idUsuario)
				.orElseThrow(() -> new EntityNotFoundException("User not found: " + idUsuario));
	}

}
