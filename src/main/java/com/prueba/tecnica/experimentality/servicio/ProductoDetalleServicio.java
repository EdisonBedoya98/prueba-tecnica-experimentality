package com.prueba.tecnica.experimentality.servicio;

import org.springframework.data.domain.Pageable;

import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;

public interface ProductoDetalleServicio {
	
	public ProductoDetalle detalleProducto(Integer idProductoDetalle);
}
