package br.edu.uniabeu.prjteste.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniabeu.prjteste.core.base.BaseService;
import br.edu.uniabeu.prjteste.dao.impl.GrupoDAO;
import br.edu.uniabeu.prjteste.dto.GrupoDTO;


@Service
@Transactional
public class GrupoService extends BaseService {
	@Autowired
	GrupoDAO grupoDAO;
	
	public Integer save (GrupoDTO grupo)throws Exception{
		try {
			if(grupo.getDescricao().isEmpty()) {
				throw new Exception("Dados de grupo inválidos!");
				}
			return grupoDAO.save(grupo);
		} catch (Exception e) {
			throw e;
		}
			
}

	public GrupoDTO getGrupo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	}


