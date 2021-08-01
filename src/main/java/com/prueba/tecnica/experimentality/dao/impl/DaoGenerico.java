package com.prueba.tecnica.experimentality.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.prueba.tecnica.experimentality.entidades.ProductoDetalle;
import com.prueba.tecnica.experimentality.excepciones.DatosNoEncontradosException;

public abstract class DaoGenerico<T extends Serializable> {

	private Class<T> claseT;

	@PersistenceContext
	EntityManager administradorEntidad;

	public void setclaseT(Class<T> claseTASetear) {
		this.claseT = claseTASetear;
	}

	public T encontrarPorId(Integer id) {
		return administradorEntidad.find(claseT, id);
	}

	public List<T> getTodos() {
		List<T> resultado =administradorEntidad.createQuery("FROM " + claseT.getName()).getResultList();
		 if (resultado.isEmpty()) {
	            throw new DatosNoEncontradosException();
	        }
		return resultado;
	}
	
	public List<T> getPorColumna(String columna,String valorABuscar,int numeroPagina,int tamanoPagina){

		List<T> resultado = administradorEntidad.createQuery("FROM " + claseT.getName() +" e WHERE e."+columna+" LIKE "+":valorABuscar")
				.setParameter("valorABuscar", "%"+valorABuscar+"%")
				.setFirstResult((numeroPagina-1) * tamanoPagina)
				.setMaxResults(tamanoPagina)
				.getResultList();
        if (resultado.isEmpty()) {
            throw new DatosNoEncontradosException();
        }
		return resultado;
	}

	public void guardar(T entidad) {
		administradorEntidad.persist(entidad);
	}

	public void actualizar(T entidad) {
		administradorEntidad.merge(entidad);
	}

	public void borrar(T entidad) {
		administradorEntidad.remove(entidad);
	}

	public void borrarPorId(Integer idEntidad) {
		T entidad = encontrarPorId(idEntidad);
		borrar(entidad);
	}
	
	public List<T> getPorQuery(String query){	

		List<T> resultado = administradorEntidad.createQuery(query)
				.getResultList();
		return resultado;
	}
}
