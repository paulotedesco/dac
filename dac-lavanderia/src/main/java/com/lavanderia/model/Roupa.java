/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lavanderia.model;

/**
 *
 * @author loki
 */
public class Roupa {
    private Long id;
    private String nome;
    private Double preco;
    private int diasLavagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getDiasLavagem() {
        return diasLavagem;
    }

    public void setDiasLavagem(int diasLavagem) {
        this.diasLavagem = diasLavagem;
    }
    
}
