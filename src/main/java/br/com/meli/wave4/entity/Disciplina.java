package br.com.meli.wave4.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Disciplina {

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z]$")
    @Size(min = 8, max = 50)
    private String descricaoMateria;

    @Pattern(regexp = "[0-10]")
    @Size(min = 1, max = 2)
    private double nota;
}
