package br.edu.uniabeu.prjteste.controller;

import java.math.BigInteger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.uniabeu.prjteste.dto.ClienteDTO;
import br.edu.uniabeu.prjteste.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;

@RequestMapping(method = RequestMethod.GET, value = "/cliente")	
	public String clienteForm() {
		return "clienteform";
		}
@RequestMapping(method = RequestMethod.POST, value = "/cliente/save")
public String saveCliente(ClienteDTO cliente, HttpSession session, Model model) throws Exception {
	if (session.getAttribute("usuario") == null) {
		return "redirect:/login";
		}
	try {
		clienteService.save(cliente);
		model.addAttribute("clientedto", cliente);
		return "clienteOkform";
		} catch (Exception e) {
		throw e;
		}
	}
@RequestMapping(method = RequestMethod.GET, value= "/cliente/{cpf}")
@ResponseBody		
		public ClienteDTO getcliente(@PathVariable BigInteger cpf, HttpSession session, Model model)
		throws Exception{
	if (session.getAttribute("user") == null) {
		return null;
	}
	return clienteService.getCliente(cpf);
}

@RequestMapping(method = RequestMethod.GET, value = "/clienteconsultaform")
public String clienteconsultaForm() {
	return "clienteconsultaform";
}

@RequestMapping(method = RequestMethod.POST, value = "/cliente")
public String getCliente(BigInteger cpf , HttpSession session, Model model) 
		throws Exception {
	if (session.getAttribute("user") == null) {
		return null;
	}
	try {
		ClienteDTO cliente = clienteService.getCliente(cpf);
		model.addAttribute("clientedto", cliente);
	} catch (Exception e) {
		model.addAttribute("msgdto", e.getMessage());
	}
	return "clienteconsultaform";
}


}

