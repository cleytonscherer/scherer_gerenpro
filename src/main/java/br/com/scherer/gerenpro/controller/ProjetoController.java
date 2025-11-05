package br.com.scherer.gerenpro.controller;

import br.com.scherer.gerenpro.dto.ProjetoCadastro;
import br.com.scherer.gerenpro.dto.ProjetoDTO;
import br.com.scherer.gerenpro.entity.Projeto;
import br.com.scherer.gerenpro.service.ProjetoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static br.com.scherer.gerenpro.controller.ConstantesRest.PATH_PROJETOS;

@RestController
@RequestMapping(PATH_PROJETOS)
@AllArgsConstructor
public class ProjetoController {

    private final ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoDTO> cadastrarProjeto(@RequestBody @Valid ProjetoCadastro projetoCadastro) {
        Projeto projeto = projetoService.cadastrarProjeto(projetoCadastro);

        System.out.println(projeto.toString());

        return ResponseEntity
                .created(URI.create(PATH_PROJETOS + "/" + projeto.getId()))
                .body(new ProjetoDTO(projeto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoDTO> listarProjetoPorId(@PathVariable("id") String id) {
        Projeto projeto = projetoService.listarPorId(id);
        return ResponseEntity.ok(new ProjetoDTO(projeto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjetoDTO> atualizarProjeto(
            @PathVariable("id") String id,
            @RequestBody @Valid ProjetoCadastro projetoCadastro) {
        Projeto projeto = projetoService.atualizar(id, projetoCadastro);
        return ResponseEntity.ok(new ProjetoDTO(projeto));
    }
}
