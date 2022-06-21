package br.com.fatecararas.caixadesugestoes.services;

import br.com.fatecararas.caixadesugestoes.model.TipoSugestao;
import br.com.fatecararas.caixadesugestoes.repositories.TipoSugestaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TipoSugestaoService {
   @Autowired
   private TipoSugestaoRepository repository;

   public List<TipoSugestao> buscarTodos() {
      List<TipoSugestao> tiposugestao = new ArrayList<>();
      tiposugestao = repository.findAll();
      return tiposugestao;
   }

   public void salvar(TipoSugestao tiposugestao) {
      repository.save(tiposugestao);
   }

   public void salvarTodos(Iterable<TipoSugestao> tiposugestao) {
      repository.saveAll(tiposugestao);
   }
}
