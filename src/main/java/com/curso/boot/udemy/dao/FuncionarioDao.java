package com.curso.boot.udemy.dao;

import java.time.LocalDate;
import java.util.List;

import com.curso.boot.udemy.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario entity);
	
	void update(Funcionario entity);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargoId(Long idCargo);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataSaida(LocalDate saida);

	List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);
}
