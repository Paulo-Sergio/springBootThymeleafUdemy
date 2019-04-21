package com.curso.boot.udemy.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.curso.boot.udemy.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	@Override
	public List<Funcionario> findByNome(String nome) {
		TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
		query.setParameter("nome", "%" + nome + "%");
		
		return query.getResultList();
		/**
		 * OU utilizar o metodo generico que criei em AbstractDao.createQuery
		 * return createQuery("select f from Funcionario f where f.nome like concat('%', ?1, '%')", nome);
		 */
	}

	@Override
	public List<Funcionario> findByCargoId(Long idCargo) {
		TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("select f from Funcionario f where f.cargo.id = :idCargo", Funcionario.class);
		query.setParameter("idCargo", idCargo);
		
		return query.getResultList();
		/**
		 * OU utilizar o metodo generico que criei em AbstractDao.createQuery
		 * return createQuery("select f from Funcionario f where f.cargo.id = ?1", nome);
		 */
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada = :dataEntrada ")
				.append("order by f.dataEntrada asc")
				.toString();
			
		TypedQuery<Funcionario> query = getEntityManager().createQuery(jpql, Funcionario.class);
		query.setParameter("dataEntrada", entrada);
		
		return query.getResultList();
		/**
		 * OU utilizar o metodo generico que criei em AbstractDao.createQuery
		 * return createQuery(jpql, entrada);
		 */
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataSaida = :dataSaida ")
				.append("order by f.dataEntrada asc")
				.toString();
			
		TypedQuery<Funcionario> query = getEntityManager().createQuery(jpql, Funcionario.class);
		query.setParameter("dataSaida", saida);
		
		return query.getResultList();
		/**
		 * OU utilizar o metodo generico que criei em AbstractDao.createQuery
		 * return createQuery(jpql, saida);
		 */
	}

	@Override
	public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("select f from Funcionario f ")
			.append("where f.dataEntrada >= :dataEntrada and f.dataSaida <= :dataSaida ")
			.append("order by f.dataEntrada asc")
			.toString();
		
		TypedQuery<Funcionario> query = getEntityManager().createQuery(jpql, Funcionario.class);
		query.setParameter("dataEntrada", entrada);
		query.setParameter("dataSaida", saida);
		
		return query.getResultList();
		/**
		 * OU utilizar o metodo generico que criei em AbstractDao.createQuery
		 * return createQuery(jpql, entrada, saida);
		 */
	}

}
