package com.alura.LiterAlura.Entity;

import com.alura.LiterAlura.Dto.AuthorDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private Long id;

    @Column(unique = true)
    private String name;

    private Integer anoNascimento;

    private Integer anoFalecimento;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books;

    public Author(AuthorDTO authorDTO) {
        this.name = authorDTO.nomeAutor();
        this.anoNascimento = authorDTO.anoNascimento();
        this.anoFalecimento = authorDTO.anoFalecimento();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + name
                + "\n Fecha de Nacimiento: " + anoNascimento
                + "\n Fecha de Fallecimiento: " + anoFalecimento
                + "\n Libros: " + books.stream().map(b -> b.getTitle()).collect(Collectors.toList());
    }
}
