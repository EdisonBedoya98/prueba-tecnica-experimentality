package com.prueba.tecnica.experimentality.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.experimentality.entidades.Producto;
import com.prueba.tecnica.experimentality.servicio.ProductoServicio;

@RestController
@RequestMapping("/api")
public class ProductoControlador {

	@Autowired
	private ProductoServicio productoServicio;

	// retornará todos los productos mas buscados
	@GetMapping("/productos-mas-buscados")
	public List<Producto> findAll() {

		return productoServicio.productosMasBuscados();
	}

	// retornará todos los productos por nombre expecificado
	@GetMapping("/productos-por-nombre")
	public List<Producto> productosPorNombre(@RequestParam String nombre) {
		return productoServicio.productosPorNombre(nombre);
	}
	

	@GetMapping("/hi")
	public String hi() {
		// retornará todos los usuarios
		return "Hi";
	}

}
