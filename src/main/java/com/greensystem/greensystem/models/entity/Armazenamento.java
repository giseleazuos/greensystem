package com.greensystem.greensystem.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "armazenamento")
public class Armazenamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "codEmpresa")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codRecursos")
    private FontesNaturais fontesNaturais;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FontesNaturais getFontesNaturais() {
        return fontesNaturais;
    }

    public void setFontesNaturais(FontesNaturais fontesNaturais) {
        this.fontesNaturais = fontesNaturais;
    }
}
