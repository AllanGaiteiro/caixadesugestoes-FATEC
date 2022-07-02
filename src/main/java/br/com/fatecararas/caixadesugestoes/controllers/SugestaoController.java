package br.com.fatecararas.caixadesugestoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;
import br.com.fatecararas.caixadesugestoes.services.SugestaoService;

@RequestMapping("/sugestoes")
@Controller
public class SugestaoController {

    @Autowired
    private SugestaoService service;

    @GetMapping("/listar")
    public String listarSugestoes(Model model) {
        List<Sugestao> sugestoes = service.buscarTodos();
        model.addAttribute("sugestoes", sugestoes);
        return "index";
    }
    
    @GetMapping("/adicionar")
    public String adicionarSugestao(Sugestao sugestao) {
        return "sugestoes/adicionar";
    }

    @PostMapping("/salvar")
    public String salvar(Sugestao sugestao) {
        service.salvar(sugestao);
        return "redirect:/sugestoes/adicionar";
    }
}
