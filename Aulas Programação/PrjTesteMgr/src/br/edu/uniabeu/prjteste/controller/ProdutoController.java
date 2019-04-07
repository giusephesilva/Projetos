package br.edu.uniabeu.prjteste.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.uniabeu.prjteste.dto.ProdutoDTO;
import br.edu.uniabeu.prjteste.service.ProdutoService;

@Controller
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/produto")	
	public String produtoform(){
		return "produtoform";
		}

	@RequestMapping(method = RequestMethod.POST, value = "/produto/save")
	public String saveProduto(ProdutoDTO produto, HttpSession session, Model model) throws Exception {
		if (session.getAttribute("usuario") == null) {
			return "redirect:/login";
			}
		try {
			produtoService.save(produto);
			model.addAttribute("produtodto", produto);
			return "produtoOkform";
			} catch (Exception e) {
			throw e;
			}
		}
	@RequestMapping(method = RequestMethod.GET, value= "/produto/{idprodutos}")
	@ResponseBody		
			public ProdutoDTO getproduto(@PathVariable int idprodutos, HttpSession session, Model model)
			throws Exception{
		if (session.getAttribute("user") == null) {
			return null;
		}
		return produtoService.getProduto(idprodutos);
	}

}
