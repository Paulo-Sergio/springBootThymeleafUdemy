package com.curso.boot.udemy.dao;

import java.util.List;

import com.curso.boot.udemy.domain.Departamento;

public interface DepartamentoDao {

	void save(Departamento entity);
	
	void update(Departamento entity);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
}
