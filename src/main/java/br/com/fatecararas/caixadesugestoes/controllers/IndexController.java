package br.com.fatecararas.caixadesugestoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;
import br.com.fatecararas.caixadesugestoes.services.SugestaoService;

@RequestMapping("/")
@Controller
public class IndexController {
    @Autowired
    private SugestaoService service;
    public String index(Model model) {  
        List<Sugestao> sugestoes = service.buscarTodos();
        model.addAttribute("sugestoes", sugestoes);
        System.out.println("Sugestoes encontradas: " + sugestoes.size());

        return "index";
    }
}
