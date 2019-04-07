package br.edu.uniabeu.prjteste.dto;

import java.io.Serializable;

public class DocumentoDTO implements Serializable{

	private static final long serialVersionUID = 4275653320751963045L;
	
	private int idDOCUMENTO;

	private String digito;
	
	private String numeroDoc;
	
	private String tipoDocumento;
	
	
	public DocumentoDTO( int idDOCUMENTO,String digito,
			String numeroDoc, String tipoDocumento ) {
		
		super();
		this.idDOCUMENTO = idDOCUMENTO;
		this.digito = digito;
		this.numeroDoc = numeroDoc;
		this.tipoDocumento = tipoDocumento;
	}


	public int getIdDOCUMENTO() {
		return idDOCUMENTO;
	}


	public void setIdDOCUMENTO(int idDOCUMENTO) {
		this.idDOCUMENTO = idDOCUMENTO;
	}


	public String getDigito() {
		return digito;
	}


	public void setDigito(String digito) {
		this.digito = digito;
	}


	public String getNumeroDoc() {
		return numeroDoc;
	}


	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDOCUMENTO;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoDTO other = (DocumentoDTO) obj;
		if (idDOCUMENTO != other.idDOCUMENTO)
			return false;
		return true;
	}
	
}
