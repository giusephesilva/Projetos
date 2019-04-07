package br.edu.uniabeu.prjteste.dao.impl;

import java.math.BigInteger;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.core.NestedRuntimeException;

import br.edu.uniabeu.prjteste.core.base.BaseDao;
import br.edu.uniabeu.prjteste.dto.ClienteDTO;
import br.edu.uniabeu.prjteste.dto.DocumentoDTO;

public class DocumentoDaoimpl extends BaseDao implements DocumentoDAO{
	
	@Override
    public DocumentoDTO getDocumento(int idDOCUMENTO)throws PersistenceException, NestedRuntimeException {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("select new br.edu.uniabeu.prjteste.dto.DocumentoDTO ");
			sb.append("( d.idDOCUMENTO, d. digito, d.numeroDoc, d.tipoDocumento) ");
			sb.append(" from Documento  d ");
			sb.append(" where d.idDOCUMENTO = :idDOCUMENTO");
		
		DocumentoDTO documentoDTO = (DocumentoDTO) getEntityManager().createQuery(sb.toString()).setParameter("idDOCUMENTO", idDOCUMENTO)
				.getSingleResult();
		return documentoDTO;
	} catch (NoResultException e) {
		throw new PersistenceException("documento Inválido");
	}
	}
	@Override
	public BigInteger save(DocumentoDTO documento) throws PersistenceException, NestedRuntimeException {
		try {
			
			Documento doc = new Documento();
			doc.setidDOCUMENT(documento.getIdDOCUMENTO());
			doc.setdigito(documento.getDigito());
			doc.setnumeroDoc(documento.getNumeroDoc());
			doc.settipoDocumento(documento.getTipoDocumento());
			getEntityManager().persist(doc);
			return doc.getIdDOCUMENTO();
		} catch (Exception e) {
			throw new PersistenceException(e.getMessage());
		}
	}
}

