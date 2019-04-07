package br.edu.uniabeu.prjteste.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniabeu.prjteste.core.base.BaseService;
import br.edu.uniabeu.prjteste.dao.impl.ProdutoDAO;
import br.edu.uniabeu.prjteste.dto.ProdutoDTO;
@Service
@Transactional
public class ProdutoService extends BaseService {
	@Autowired
	ProdutoDAO produtoDao;
	
	public BigInteger save (ProdutoDTO produto) throws Exception{
		try {
			if (produto.getIdprodutos() == 0 || produto.getNome().isEmpty() || produto.getQuantidade().isEmpty()) {
				throw new Exception("Dados de produto inválidos!");
			}
			return produtoDao.save(produto);
		} catch (Exception e) {
			throw e;
		}
	}
		public ProdutoDTO getProduto(int idprodutos)throws Exception{
			return produtoDao.getProduto(idprodutos);
		}
}
