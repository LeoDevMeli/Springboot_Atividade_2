package br.com.meli.wave4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

}
