package br.com.scherer.gerenpro.repository;

import br.com.scherer.gerenpro.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, String> {

}
