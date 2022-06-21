package br.com.fatecararas.caixadesugestoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
    @Autowired
    private SugestaoController service;

    public void index(Model model) {   
        service.listarSugestoes(model);
        //return "index";
    }
}
