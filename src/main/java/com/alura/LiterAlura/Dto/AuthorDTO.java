package com.alura.LiterAlura.Dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AuthorDTO(
        @JsonAlias("name")
        String nomeAutor,
        @JsonAlias("birth_year")
        int anoNascimento,
        @JsonAlias("death_year")
        int anoFalecimento
        ) {

    @Override
    public String toString() {
        return "\n Nome: " + nomeAutor
                + "\n Ano de Nascimento: " + anoNascimento
                + "\n Ano de Falecimento: " + anoFalecimento;
    }
}
