package com.prueba.tecnica.experimentality.controlador;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;
import com.prueba.tecnica.experimentality.servicio.ProductoDetalleServicio;

@RestController
@RequestMapping("/api")
public class ProductoDetalleControlador {

	@Autowired
	private ProductoDetalleServicio productoDetalleServicio;
	
	// retornará todos los productos por nombre expecificado
		@GetMapping("/detalle-producto")
		public ProductoDetalle productosPorNombre(@RequestParam Integer idProductoDetalle) {
			return productoDetalleServicio.detalleProducto(idProductoDetalle);
		}
		
}
