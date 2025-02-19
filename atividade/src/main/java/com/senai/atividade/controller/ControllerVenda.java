package com.senai.atividade.controller;

import com.senai.atividade.db.BancoDeDados;
import com.senai.atividade.model.Venda;

import java.util.List;

public class ControllerVenda {
    private BancoDeDados b = new BancoDeDados();

    public ControllerVenda() {
    }

    public List<Venda> listarVenda() {
        return b.buscarVendas();
    }

    public void postarVenda(Venda v) {
        b.insert(v);
    }

    public Boolean atualizarVenda(Venda v) {
        return b.update3(v);
    }

    public Boolean deletarVenda(Venda v) {
        return b.delete3(v.getIdVenda());
    }

}
