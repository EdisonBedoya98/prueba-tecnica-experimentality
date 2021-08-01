package com.prueba.tecnica.experimentality.controlador;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public List<Producto> getProductosMasBuscados() {
		return productoServicio.productosMasBuscados();
	}

	// retornará todos los productos por nombre expecificado
	@GetMapping("/productos-por-nombre")
	public ResponseEntity<?> productosPorNombre(@RequestParam String nombre,
			@RequestParam(value= "numeroPagina", defaultValue = "1") int numeroPagina,
			@RequestParam(value= "tamanoPagina", defaultValue = "10") int tamanoPagina){
		HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("contenido", productoServicio.productosPorNombre(numeroPagina,tamanoPagina,nombre));
	    map.put("numeroPagina", numeroPagina);
	    map.put("tamanoPagina", tamanoPagina);
	    return ResponseEntity.ok(map);
	 }
	

	@GetMapping("/hi")
	public String hi()  {
		// retornará todos los usuarios
		
		return "Hi";
	}

}
