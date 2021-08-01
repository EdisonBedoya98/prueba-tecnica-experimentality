package com.prueba.tecnica.experimentality.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.prueba.tecnica.experimentality.dao.ProductoDao;
import com.prueba.tecnica.experimentality.entidades.Producto;
import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;

@Repository
public class ProductoDaoImpl extends DaoGenerico<Producto> implements ProductoDao{

	
	public ProductoDaoImpl() {
		setclaseT(Producto.class);	
	}

	@Override
	public List<Producto> getProductosMasBuscados() {		
		return getTodos();
	}

	@Override
	public List<Producto> getProductosPorNombre(String nombre) {		
		return getPorColumna("nombreProducto", nombre);
	}


}
