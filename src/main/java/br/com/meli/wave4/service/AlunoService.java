package br.com.meli.wave4.service;

import br.com.meli.wave4.entity.Aluno;
import br.com.meli.wave4.entity.Disciplina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    List<Aluno> listaAlunos = new ArrayList<>();

    public Aluno adicionaAluno(Aluno aluno){
        listaAlunos.add(aluno);
        return aluno;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public Aluno getAluno(String nome){
        for (Aluno aluno: listaAlunos){
            if(aluno.getNome().equals(nome)){
                return aluno;
            }
        }
        return null;
    }

    public String mediaAluno(String nome){
        double media = 0;
        Aluno aluno = getAluno(nome);
        for (Disciplina disciplina: aluno.getDisciplinas()){
            media += disciplina.getNota();
        }

        if(media/aluno.getDisciplinas().size() > 9.0){
            return "PARABENS!!!" + aluno.toString() + " Média: "+ media/aluno.getDisciplinas().size();
        }
        return aluno.toString() + " Média: "+ media/aluno.getDisciplinas().size();
    }

}
