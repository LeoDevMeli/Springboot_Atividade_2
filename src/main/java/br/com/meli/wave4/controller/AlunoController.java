package br.com.meli.wave4.controller;

import br.com.meli.wave4.entity.Aluno;
import br.com.meli.wave4.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;


    @PostMapping("/cadastrarAlunos")
    public ResponseEntity<Aluno> cadastrarAluno(@Valid @RequestBody Aluno aluno, UriComponentsBuilder uriBuilder){
        alunoService.adicionaAluno(aluno);
        URI uri = uriBuilder
                .path("/usuarios/{id}")
                .buildAndExpand(aluno.getNome())
                .toUri();
        return ResponseEntity.created(uri).body(aluno);
    }

    @GetMapping("/exibirAlunos")
    public List<Aluno> exibirAlunos(){
        return alunoService.getListaAlunos();
    }

    @GetMapping("/exibirAluno/{nome}")
    public Aluno exibirAluno(@PathVariable String nome){
        return alunoService.getAluno(nome);
    }

    @GetMapping("/mediaAluno/{nome}")
    public String mediaAluno(@PathVariable String nome){
        return alunoService.mediaAluno(nome);
    }
}
