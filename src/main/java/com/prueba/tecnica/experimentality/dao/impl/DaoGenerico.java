package com.prueba.tecnica.experimentality.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		return administradorEntidad.createQuery("FROM " + claseT.getName()).getResultList();
	}
	public List<T> getPorColumna(String columna,String valorABuscar){
		return administradorEntidad.createQuery("FROM " + claseT.getName() +" e WHERE e."+columna+" LIKE "+":valorABuscar")
				.setParameter("valorABuscar", "%"+valorABuscar+"%").getResultList();
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
}
