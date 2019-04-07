package br.edu.uniabeu.prjteste.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.uniabeu.prjteste.dto.GrupoDTO;
import br.edu.uniabeu.prjteste.service.GrupoService;

@Controller
public class GrupoController {
	
	@Autowired
    GrupoService grupoService;
	
@RequestMapping (method = RequestMethod.GET, value = "/grupo")
public String grupoform() {
	return "grupoform";
}

@RequestMapping (method = RequestMethod.POST, value = "/grupo/save")
public String saveGrupo(GrupoDTO grupo, HttpSession session, Model model) throws Exception {
	if (session.getAttribute("grupo")==null) {
		return "redirect:/login";
		}
	try {
		grupoService.save(grupo);
		model.addAttribute("grupodto", grupo);
		return"grupookfom";
	    }catch (Exception e) {
			throw e;
			}
	}
@RequestMapping(method = RequestMethod.GET, value = "/grupoconsultaform")
public String grupoconsultaForm() {
	return "grupoconsultaform";
}

@RequestMapping(method = RequestMethod.POST, value = "/grupo")
public String getGrupo(Integer codigo , HttpSession session, Model model) 
		throws Exception {
	if (session.getAttribute("user") == null) {
		return null;
	}
	try {
		GrupoDTO grupo = grupoService.getGrupo(codigo);
		model.addAttribute("grupodto", grupo);
	} catch (Exception e) {
		model.addAttribute("msgdto", e.getMessage());
	}
	return "grupoconsultaform";
}
}

	
	
	
	
	
	
	
	

