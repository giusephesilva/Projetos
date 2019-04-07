package br.edu.uniabeu.prjteste.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uniabeu.prjteste.core.base.BaseService;
import br.edu.uniabeu.prjteste.dao.impl.DocumentoDAO;
import br.edu.uniabeu.prjteste.dto.DocumentoDTO;

@Service
@Transactional
public class DocumentoService extends BaseService {
	@Autowired
	DocumentoDAO documentoDAO;

	public BigInteger save(DocumentoDTO documento) throws Exception {
		try {
			if (documento.getIdDOCUMENTO()==0|| documento.getDigito().isEmpty() ||documento.getNumeroDoc().isEmpty()
					|| documento.getTipoDocumento().isEmpty()) {
				throw new Exception("Dados do documento inválidos!");
			}
			return documentoDAO.save(documento);
		} catch (Exception e) {
			throw e;
		}

	}

	public DocumentoDTO getDocumento(int IdDOCUMENTO) throws Exception {
		return documentoDAO.getDocumento(IdDOCUMENTO);

	}

}
