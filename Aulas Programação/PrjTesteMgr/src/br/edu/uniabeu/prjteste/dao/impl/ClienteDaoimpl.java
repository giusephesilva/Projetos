package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;
import org.springframework.stereotype.Repository;

import br.edu.uniabeu.prjteste.core.base.BaseDao;
import br.edu.uniabeu.prjteste.dto.ClienteDTO;
import teste.Cliente;
@Repository
public class ClienteDaoimpl extends BaseDao implements ClienteDAO {

	@Override
	public ClienteDTO getCliente(BigInteger cpf) throws PersistenceException, NestedRuntimeException {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("select new br.edu.uniabeu.prjteste.dto.clienteDTO ");
			sb.append("( c.cpf, c.endereco, c.nome, c.sexo, c.uf ) ");
			sb.append(" from Cliente  c ");
			sb.append(" where c.cpf = :cpf");
			ClienteDTO clienteDTO = (ClienteDTO) getEntityManager().createQuery(sb.toString()).setParameter("cpf", cpf)
					.getSingleResult();
			return clienteDTO;
		} catch (NoResultException e) {
			throw new PersistenceException("cliente Inválido");
		}
	}

	@Override
	public BigInteger save(ClienteDTO cliente) throws PersistenceException, NestedRuntimeException {
		try {
			// cria um objeto de entidade do mapeamento O/R (projeto JPA)
			Cliente cli = new Cliente();
			cli.setCpf(cliente.getCpf());
			cli.setEndereco(cliente.getEndereco());
			cli.setNome(cliente.getNome());
			cli.setSexo(cliente.getSexo());
			cli.setUf(cliente.getUf());
			getEntityManager().persist(cli);
			// retorna o id criado para o usuário
			return cli.getCpf();
		} catch (Exception e) {
			throw new PersistenceException(e.getMessage());
		}
	}

}
