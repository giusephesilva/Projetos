package br.edu.uniabeu.prjteste.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;
import org.springframework.stereotype.Repository;

import br.edu.uniabeu.prjteste.core.base.BaseDao;
import br.edu.uniabeu.prjteste.dto.UsuarioDTO;
import teste.Usuario;

@Repository
public class UsuarioDAOImpl extends BaseDao implements UsuarioDAO {

	@Override
	public UsuarioDTO getUsuario(String user) throws PersistenceException, NestedRuntimeException {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("select new br.edu.uniabeu.prjteste.dto.UsuarioDTO ");
			sb.append("( u.idusuario, u.nome, u.senha ) ");
			sb.append(" from Usuario u ");
			sb.append(" where u.nome = :login ");
			UsuarioDTO userDTO = (UsuarioDTO) getEntityManager().createQuery(sb.toString()).setParameter("login", user)
					.getSingleResult();
			return userDTO;
		} catch (NoResultException e) {
			throw new PersistenceException("Usuário Inválido");
		}
	}

	@Override
	public Integer save(UsuarioDTO usuario) throws PersistenceException, NestedRuntimeException {
		try {
			// cria um objeto de entidade do mapeamento O/R (projeto JPA)
			Usuario user = new Usuario();
			user.setNome(usuario.getNome());
			user.setSenha(usuario.getSenha());
			getEntityManager().persist(user);
			// retorna o id criado para o usuário
			return user.getIdUsuario();
		} catch (Exception e) {
			throw new PersistenceException(e.getMessage());
		}
	}
}
