package br.com.fatecararas.caixadesugestoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;

@Repository
public interface SugestaoRepository extends JpaRepository<Sugestao, Integer>{
    
}
