package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.core.base.BaseDao;
import br.edu.uniabeu.prjteste.dto.ProdutoDTO;

public class ProdutoDAOimpl extends BaseDao implements ProdutoDAO{

	@Override
	public
	 ProdutoDTO getProduto(int idprodutos) throws PersistenceException, NestedRuntimeException {
			try {
				StringBuilder sb = new StringBuilder();
				sb.append("select new br.edu.uniabeu.prjteste.dto.ProdutoDTO ");
				sb.append("( p.idprodutos, p.nome, p.quantidade) ");
				sb.append(" from Produtos  p ");
				sb.append(" where p.idprodutos = :idprodutos");
				ProdutoDTO produtoDTO = (ProdutoDTO) getEntityManager().createQuery(sb.toString()).setParameter("idprodutos", idprodutos)
						.getSingleResult();
				return produtoDTO;
			} catch (NoResultException e) {
				throw new PersistenceException("produto Inválido");
			}
	}
	@Override
	public BigInteger save(ProdutoDTO produto) throws PersistenceException, NestedRuntimeException {
		try {
			Produtos pro = new Produtos();
			pro.setidprodutos(Produtos.getidprodutos());
			pro.setnome(Produtos.getnome());
			pro.setquantidade(produtos.getnome());
			getEntityManager().persist(pro);
			
			return pro.getidprodutos();
		} catch (Exception e) {
			throw new PersistenceException(e.getMessage());
		}
	}
}
