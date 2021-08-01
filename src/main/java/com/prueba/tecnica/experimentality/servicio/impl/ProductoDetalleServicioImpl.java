package com.prueba.tecnica.experimentality.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.experimentality.dao.ProductoDetalleDao;
import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;
import com.prueba.tecnica.experimentality.servicio.ProductoDetalleServicio;

@Service
public class ProductoDetalleServicioImpl implements ProductoDetalleServicio {

	@Autowired
	private ProductoDetalleDao productoDetalleDao;

	@Override
	public ProductoDetalle detalleProducto(Integer idProductoDetalle) {
		ProductoDetalle productoDetalle = productoDetalleDao.getDetalleProducto(idProductoDetalle);
		return productoDetalle;
	}
	
	
}
