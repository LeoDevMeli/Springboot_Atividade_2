package br.com.meli.wave4.controller;

import br.com.meli.wave4.entity.Aluno;
import br.com.meli.wave4.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/cadastrarAlunos")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        alunoService.adicionaAluno(aluno);
        return aluno;
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
