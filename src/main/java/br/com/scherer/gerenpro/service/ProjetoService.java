package br.com.scherer.gerenpro.service;

import br.com.scherer.gerenpro.dto.ProjetoCadastro;
import br.com.scherer.gerenpro.entity.Projeto;
import br.com.scherer.gerenpro.entity.SituacaoProjeto;
import br.com.scherer.gerenpro.repository.ProjetoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class ProjetoService {

    private final ProjetoRepository projetoRepository;

    @Transactional
    public Projeto cadastrarProjeto(ProjetoCadastro projetoCadastro) {
        Projeto projeto = new Projeto(projetoCadastro);

        projeto.setSituacao(SituacaoProjeto.CRIADO);
        projeto.setDataCriacao(LocalDate.now());
        projeto.setDataAlteracao(LocalDate.now());
        projeto.setAtivo(true);

        return projetoRepository.save(projeto);
    }
}
