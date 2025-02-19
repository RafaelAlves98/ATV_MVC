package com.senai.atividade.model;

import lombok.Getter;
import lombok.Setter;

public class Produto {

    @Getter
    @Setter

    int idProduto;
    String nome;
    double preco;
    Integer quantidade;

    public Produto(int idProduto, String nome, double preco, int quantidade) {
    }
}
