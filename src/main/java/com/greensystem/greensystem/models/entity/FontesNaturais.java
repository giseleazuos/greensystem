package com.greensystem.greensystem.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fontesnaturais")
public class FontesNaturais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codRecursos")
    private Integer codRecursos;

    // Nome da fonte de recursos, aumentado para 100 caracteres (ajuste conforme necessário)
    @Column(name = "nome", length = 100) 
    private String nome;

    // Getters e Setters
    public Integer getCodRecursos() {
        return codRecursos;
    }

    public void setCodRecursos(Integer codRecursos) {
        this.codRecursos = codRecursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FontesNaturais{" +
                "codRecursos=" + codRecursos +
                ", nome='" + nome + '\'' +
                '}';
    }
}
