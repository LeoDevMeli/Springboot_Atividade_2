package br.com.meli.wave4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data

public class Aluno {

    @NotNull(message = "nome é obrigatorio")
    @NotEmpty(message = "nome é obrigatório")
    @Pattern(regexp = "^[a-zA-Z]$", message = "Informacao nao aceita")
    @Size(min = 8, max = 50, message = "tamanho minimo 8, máximo 50")
    private String nome;

    @Valid
    @NotNull (message = "aluno deve ter disciplinas")
    private List<Disciplina> disciplinas;

}
