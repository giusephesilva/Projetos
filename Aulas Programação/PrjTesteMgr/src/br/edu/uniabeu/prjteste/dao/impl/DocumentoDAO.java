package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.dto.DocumentoDTO;

public interface DocumentoDAO {

		public DocumentoDTO getDocumento(int idDOCUMENTO) throws
		PersistenceException, NestedRuntimeException;
		
		public BigInteger save(DocumentoDTO documento) throws PersistenceException, NestedRuntimeException;

	}
