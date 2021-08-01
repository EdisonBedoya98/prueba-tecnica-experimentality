package com.prueba.tecnica.experimentality.excepciones;


import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ManejadorExcepciones {
	
	private static final Logger logger = LoggerFactory.getLogger(ManejadorExcepciones.class);
	
    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<Object> handleInvalidInputException(Exception ex) {
    	logger.error("Invalid Input Exception: ",ex);
        return new ResponseEntity<Object>(ex,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(DatosNoEncontradosException.class)
    public ResponseEntity<Object> manejadorDatosNoEncontradosException(    
    		DatosNoEncontradosException ex, WebRequest solicitud) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("mensaje", "No se encuentra informacion");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

}
