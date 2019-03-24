package com.curso.boot.udemy.dao;

import org.springframework.stereotype.Repository;

import com.curso.boot.udemy.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
