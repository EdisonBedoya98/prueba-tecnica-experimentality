package com.prueba.tecnica.experimentality.dao;

import java.util.List;

import com.prueba.tecnica.experimentality.entidades.Producto;
import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;

public interface ProductoDao {
	
	public List<Producto> getProductosMasBuscados();
	
	public List<Producto> getProductosPorNombre(String nombre);
	

}
