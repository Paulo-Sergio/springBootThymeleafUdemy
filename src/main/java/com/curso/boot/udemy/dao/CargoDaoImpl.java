package com.curso.boot.udemy.dao;

import org.springframework.stereotype.Repository;

import com.curso.boot.udemy.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
