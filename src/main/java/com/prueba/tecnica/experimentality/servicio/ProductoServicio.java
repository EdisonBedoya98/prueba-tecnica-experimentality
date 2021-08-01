package com.prueba.tecnica.experimentality.servicio;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.prueba.tecnica.experimentality.entidades.Producto;

public interface ProductoServicio {
	
	public List<Producto> productosMasBuscados();
	
	public List<Producto> productosPorNombre(int numeroPagina,int tamanoPagina, String nombre);

}
