package com.prueba.tecnica.experimentality.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="producto_detalle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductoDetalle {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_producto_detalle",updatable = false, nullable = false)
    private int idProductoDetalle;
	
	@OneToOne
	private Producto producto;
	
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="listado_imagenes")
    @ElementCollection(targetClass=String.class)
    private List<String> listadoImagenes = new ArrayList<String>();  

}
