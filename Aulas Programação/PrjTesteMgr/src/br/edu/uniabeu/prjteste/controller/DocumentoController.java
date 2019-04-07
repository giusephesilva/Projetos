package br.edu.uniabeu.prjteste.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.uniabeu.prjteste.dto.DocumentoDTO;
import br.edu.uniabeu.prjteste.service.DocumentoService;

@Controller
public class DocumentoController {
	
	@Autowired
	DocumentoService documentoService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/documento")	
	public String documentoForm() {
		return "documentoform";
		}
	@RequestMapping(method = RequestMethod.POST, value = "/documento/save")
	public String saveDocumento(DocumentoDTO documento, HttpSession session, Model model) throws Exception {
		if (session.getAttribute("usuario") == null) {
			return "redirect:/login";
			}
		try {
			documentoService.save(documento);
			model.addAttribute("documentodto", documento);
			return "documentoOkform";
			} catch (Exception e) {
			throw e;
			}
		}
	
	@RequestMapping(method = RequestMethod.GET, value= "/documento/{idDOCUMENTO}")
	@ResponseBody		
			public DocumentoDTO getdocumento(@PathVariable int idDOCUMENTO, HttpSession session, Model model)
			throws Exception{
		if (session.getAttribute("user") == null) {
			return null;
		}
		return documentoService.getDocumento(idDOCUMENTO);
	}
}
