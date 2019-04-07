package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.dto.ClienteDTO;

public interface ClienteDAO {
	public ClienteDTO getCliente(BigInteger cpf) throws
	PersistenceException, NestedRuntimeException;
	
	public BigInteger save(ClienteDTO cliente) throws PersistenceException, NestedRuntimeException;

}
