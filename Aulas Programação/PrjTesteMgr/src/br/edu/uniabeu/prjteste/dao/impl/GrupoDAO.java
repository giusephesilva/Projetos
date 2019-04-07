package br.edu.uniabeu.prjteste.dao.impl;

import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.dto.GrupoDTO;

public interface GrupoDAO {
	public GrupoDTO getGrupo(String descricao)throws
	PersistenceException, NestedRuntimeException;
	
	public Integer save(GrupoDTO grupo) throws PersistenceException, NestedRuntimeException;

}
