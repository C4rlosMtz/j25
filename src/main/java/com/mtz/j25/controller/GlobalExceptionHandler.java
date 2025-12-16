package com.mtz.j25.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<?> handleNotFound(EntityNotFoundException ex) {
		return ResponseEntity.notFound().build();
	}

	@ExceptionHandler(DataAccessException.class)
	public ResponseEntity<?> handleDataAccess(DataAccessException ex) {
		log.error("Error de acceso a datos", ex);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}
