package br.com.fatecararas.caixadesugestoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Curso;
import br.com.fatecararas.caixadesugestoes.services.CursoService;

@RequestMapping("/cursos")
@Controller
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping("/listar")
    public String listarCursos(Model model) {
        List<Curso> cursos = service.buscarTodos();
        model.addAttribute("cursos", cursos);
        return "cursos/listar";
    }
    @GetMapping("/adicionar")
    public String adicionarCurso(Curso curso) {
        return "cursos/adicionar";
    }

    @PostMapping("/salvar")
    public String salvar(Curso curso) {
        service.salvar(curso);
        return "redirect:/cursos/adicionar";
    }
}
