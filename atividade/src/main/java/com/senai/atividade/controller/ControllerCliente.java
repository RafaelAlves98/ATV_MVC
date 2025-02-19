package com.senai.atividade.controller;

import com.senai.atividade.db.BancoDeDados;
import com.senai.atividade.model.Cliente;

import java.util.List;

public class ControllerCliente {

    BancoDeDados b = new BancoDeDados();

    public ControllerCliente(){

    }

    public List<Cliente> listarCliente() {
        return b.buscarClientes();
    }

    public void postarCliente(Cliente c) {
        b.insert(c);
    }

    public Boolean atualizarCliente(Cliente c) {
        return b.update2(c);
    }

    public Boolean deletarCliente(Cliente c) {
        return b.delete2(c.getIdCliente());
    }


}
