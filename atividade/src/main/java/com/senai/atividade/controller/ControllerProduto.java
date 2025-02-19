package com.senai.atividade.controller;

import com.senai.atividade.db.BancoDeDados;
import com.senai.atividade.model.Produto;

import java.util.List;

public class ControllerProduto {

    BancoDeDados b = new BancoDeDados();

    public ControllerProduto(){
    }

    public List<Produto> listarProduto() {
        return b.buscarProdutos();
    }

    public void postarProduto(Produto p) {
        b.insert(p);
    }

    public Boolean atualizarProduto(Produto p) {
        return b.update(p);
    }

    public Boolean deletarProduto(Produto p) {
        return b.delete(p.getIdProduto());
    }

}
