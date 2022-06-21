package br.com.fatecararas.caixadesugestoes.services;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;
import br.com.fatecararas.caixadesugestoes.repositories.SugestaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SugestaoService {
   @Autowired
   private SugestaoRepository repository;

   public List<Sugestao> buscarTodos() {
      List<Sugestao> sugestao = new ArrayList<>();
      sugestao = repository.findAll();
      return sugestao;
   }

   public void salvar(Sugestao sugestao) {
      repository.save(sugestao);
   }

   public void salvarTodos(Iterable<Sugestao> sugestao) {
      repository.saveAll(sugestao);
   }
}
