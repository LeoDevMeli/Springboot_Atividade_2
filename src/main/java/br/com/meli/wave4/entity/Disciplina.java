package br.com.meli.wave4.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Disciplina {

    @NotNull
    @NotEmpty(message = "A disciplina é obrigatorio")
    @Pattern(regexp = "^[a-zA-Z]$")
    @Size(min = 8, max = 50, message = "tamanho minimo 8, máximo 50")
    private String descricaoMateria;

    @NotNull(message = "nota da disciplina é obrigatória")
    @Max(value = 10, message = "Nota não pode ser maior que 10")
    @Min(value = 0, message = "Nota não pode ser menor que 0")
    @Digits(integer = 2, fraction = 2, message = "Nota não válida. Aceito apenas de 0 a 10, com 2 dígitos decimais")
    private double nota;
}
