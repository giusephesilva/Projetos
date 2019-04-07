package br.edu.uniabeu.prjteste.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.core.base.BaseDao;
import br.edu.uniabeu.prjteste.dto.GrupoDTO;


public class GrupoDAOimpl extends BaseDao implements GrupoDAO{
	
	@Override
	public GrupoDTO getGrupo(String descricao)throws PersistenceException, NestedRuntimeException {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("select new br.edu.uniabeu.prjteste.dto.GrupoDTO");
			sb.append("( g.codigo, g.descricao) ");
			sb.append(" from Grupo  g ");
			sb.append(" where g.descricao = :descricao");
			GrupoDTO grupoDTO = (GrupoDTO) getEntityManager().createQuery(sb.toString()).setParameter("descricao", descricao).getSingleResult();
			return grupoDTO;
			}
		 catch (NoResultException e) {
				throw new PersistenceException("grupo Inválido");
			}
	

}
	
	@Override
	public Integer save(GrupoDTO grupo) throws PersistenceException, NestedRuntimeException {
		try {
			Grupo gru = new Grupo();
			gru.setCodigo(grupo.getCodigo());
			gru.setDescricao(grupo.getDescricao());
			getEntityManager().persist(gru);
			
			return	gru.getCodigo();
		} catch (Exception e) {
			throw new PersistenceException(e.getMessage());
		}
			
			
		}
	
	
	
}
