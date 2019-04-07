package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.dto.ProdutoDTO;

public interface ProdutoDAO {

	public ProdutoDTO getProduto(int idprodutos) throws
	PersistenceException, NestedRuntimeException;
	
	
	public BigInteger save(ProdutoDTO produto) throws PersistenceException, NestedRuntimeException;
}
