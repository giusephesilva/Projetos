package br.edu.uniabeu.prjteste.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniabeu.prjteste.core.base.BaseService;
import br.edu.uniabeu.prjteste.dao.impl.UsuarioDAO;
import br.edu.uniabeu.prjteste.dto.UsuarioDTO;

@Service
@Transactional
public class UsuarioService extends BaseService {
	@Autowired
	UsuarioDAO usuarioDAO;

	public boolean validarLogin(String user, String senha) throws Exception {
		UsuarioDTO usuario = usuarioDAO.getUsuario(user);
		return (usuario.getSenha().equals(senha));

	}

	public Integer save(UsuarioDTO usuario) throws Exception {
		try {
			if (usuario.getNome().isEmpty() || usuario.getSenha().isEmpty()) {
				throw new Exception("Dados de usuário inválidos!");
			}
			return usuarioDAO.save(usuario);
		} catch (Exception e) {
			throw e;
		}

	}

}
