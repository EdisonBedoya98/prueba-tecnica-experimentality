package com.prueba.tecnica.experimentality.dao.impl;

import org.springframework.stereotype.Repository;

import com.prueba.tecnica.experimentality.dao.ProductoDetalleDao;
import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;

@Repository
public class ProductoDetalleDaoImpl extends DaoGenerico<ProductoDetalle> implements ProductoDetalleDao {

	
	public ProductoDetalleDaoImpl() {
		setclaseT(ProductoDetalle.class);	
	}

	@Override
	public ProductoDetalle getDetalleProducto(Integer idProductoDetalle) {
		return encontrarPorId(idProductoDetalle);
	}

}
