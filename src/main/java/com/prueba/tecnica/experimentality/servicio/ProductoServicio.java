package com.prueba.tecnica.experimentality.servicio;

import java.util.List;

import com.prueba.tecnica.experimentality.entidades.Producto;
import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;

public interface ProductoServicio {
	
	public List<Producto> productosMasBuscados();
	
	public List<Producto> productosPorNombre(String nombre);
	
	public ProductoDetalle detalleProducto(int idProductoDetalle);

}
