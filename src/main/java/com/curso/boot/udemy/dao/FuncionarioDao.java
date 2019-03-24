package com.curso.boot.udemy.dao;

import java.util.List;

import com.curso.boot.udemy.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario entity);
	
	void update(Funcionario entity);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
