package br.edu.uniabeu.prjteste.dao.impl;
import javax.persistence.PersistenceException;
import org.springframework.core.NestedRuntimeException;
import br.edu.uniabeu.prjteste.dto.UsuarioDTO;

public interface UsuarioDAO {
	public UsuarioDTO getUsuario(String user) throws
	PersistenceException, NestedRuntimeException;
	
	public Integer save(UsuarioDTO usuario) throws PersistenceException, NestedRuntimeException;

}
