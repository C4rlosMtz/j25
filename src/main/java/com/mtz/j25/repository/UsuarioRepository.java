package com.mtz.j25.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mtz.j25.dto.UsuarioReporteVo;
import com.mtz.j25.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("""
			SELECT new com.mtz.j25.dto.UsuarioReporteVo(u.idUsuario, u.usuario, s.siglas)
			FROM Usuario u
			JOIN u.sucursal s
			WHERE u.idUsuario = :idUsuario
			""")
	Optional<UsuarioReporteVo> obtenerUsuarioReporte(@Param("idUsuario") Integer idUsuario);

}
