package com.prueba.tecnica.experimentality.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.experimentality.dao.ProductoDao;
import com.prueba.tecnica.experimentality.entidades.Producto;
import com.prueba.tecnica.experimentality.servicio.ProductoServicio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	private ProductoDao productoDao;
		

	@Override
	public List<Producto> productosMasBuscados() {
		List<Producto> productosMasBuscados = productoDao.getProductosMasBuscados();
		return productosMasBuscados;
	}

	@Override
	public List<Producto> productosPorNombre(int numeroPagina,int tamanoPagina, String nombre) {
		List<Producto> productosPorNombre = productoDao.getProductosPorNombre(numeroPagina,tamanoPagina,nombre);
		return productosPorNombre;
	}

}
