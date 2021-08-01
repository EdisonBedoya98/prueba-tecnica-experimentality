package com.prueba.tecnica.experimentality.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto implements Serializable{
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto",updatable = false, nullable = false)
    private int idProducto;
    
    @Column(name="nombre_producto")
    private String nombreProducto;

    @Column(name="precio")
    private int precio;

    @Column(name="precio_con_descuento")
    private int precioConDescuento;    

    @Column(name="porcentaje_descuento")
    private int porcentajeDescuento;
    

    @Column(name="imagen_frontal")
    private String imagenFrontal;    

    @Column(name="imagen_trasera")
    private String imagenTrasera;
}
