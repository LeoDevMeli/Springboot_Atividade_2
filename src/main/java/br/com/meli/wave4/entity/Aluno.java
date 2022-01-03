package br.com.meli.wave4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data

public class Aluno {
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z]$")
    @Size(min = 8, max = 50)
    private String nome;

    private List<Disciplina> disciplinas;

}
