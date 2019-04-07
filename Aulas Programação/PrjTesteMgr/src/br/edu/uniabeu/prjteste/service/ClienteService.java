package br.edu.uniabeu.prjteste.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniabeu.prjteste.core.base.BaseService;
import br.edu.uniabeu.prjteste.dao.impl.ClienteDAO;
import br.edu.uniabeu.prjteste.dto.ClienteDTO;

@Service
@Transactional
public class ClienteService extends BaseService {
	@Autowired
	ClienteDAO clienteDAO;

	public BigInteger save (ClienteDTO cliente) throws Exception{
		try {
			if (cliente.getCpf().longValue() == 0 || cliente.getEndereco().isEmpty() || cliente.getNome().isEmpty() || String.valueOf(cliente.getSexo()).isEmpty() || String.valueOf(cliente.getUf()).isEmpty()) {
				throw new Exception("Dados de cliente inválidos!");
			}
			return clienteDAO.save(cliente);
		} catch (Exception e) {
			throw e;
		}
		
	}
	public ClienteDTO getCliente(BigInteger cpf) throws Exception{
		return clienteDAO.getCliente(cpf);

}
}
