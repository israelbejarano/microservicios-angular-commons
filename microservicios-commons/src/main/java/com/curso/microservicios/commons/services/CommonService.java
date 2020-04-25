package com.curso.microservicios.commons.services;

import java.util.Optional;

// uso del generico E para luego usar nuestras entidades propias
public interface CommonService<E> {
	
	public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E save(E entity);
	
	public void deleteById(Long id);

}
