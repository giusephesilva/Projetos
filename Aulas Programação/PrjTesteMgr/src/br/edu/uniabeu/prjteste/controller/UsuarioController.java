package br.edu.uniabeu.prjteste.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.uniabeu.prjteste.dto.UsuarioDTO;
import br.edu.uniabeu.prjteste.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String loginForm() {
		return "loginform";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/user/login")
	public Object login(UsuarioDTO usuario, HttpSession session) throws Exception {

		try {
			if (usuarioService.validarLogin(usuario.getNome(), usuario.getSenha())) {
				session.setAttribute("user", usuario);
				return session.getServletContext().getContextPath()+"/menu";
			}
			//throw new Exception("Login/Senha inválido");
			return session.getServletContext().getContextPath()+"/loginInvalido";
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/menu")
	public String menuForm() {
		return "menuForm";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/loginInvalido")
	public String invalidLoginForm() {
		return "loginInvalidoForm";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/usuarioForm")
	public String userform() {
		return"usuarioForm";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/save")
	public String saveUser(UsuarioDTO usuario, HttpSession session, Model model) throws Exception {
		if (session.getAttribute("user") == null) {
			return "redirect:/login";
			}
		try {
			Integer idusuario = usuarioService.save(usuario); 
			usuario.setIdusuario(idusuario);
			model.addAttribute("userdto", usuario);
			return "userOkform";
			} catch (Exception e) {
			throw e;
			}
		
	}
}
