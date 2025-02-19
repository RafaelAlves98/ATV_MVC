package com.senai.atividade.view;


import com.senai.atividade.controller.ControllerCliente;
import com.senai.atividade.controller.ControllerProduto;
import com.senai.atividade.controller.ControllerVenda;
import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atividade")
public class Endpoints {

    public ControllerCliente c1 = new ControllerCliente();
    public ControllerVenda v1 = new ControllerVenda();
    public ControllerProduto p1 = new ControllerProduto();

    @GetMapping
    public List<Produto> pegarProduto() {
        return p1.listarProduto();
    }

    public List<Cliente> pegarCliente() {
        return c1.listarCliente();
    }

    public List<Venda> pegarVenda() {
        return v1.listarVenda();
    }

    @PostMapping
    public String postarProduto(@RequestBody Produto produto) {
        p1.postarProduto(produto);
        return "Sucesso!";
    }

    public String postarCliente(@RequestBody Cliente cliente) {
        c1.postarCliente(cliente);
        return "Sucesso!";
    }

    public String postarVenda(@RequestBody Venda venda) {
        v1.postarVenda(venda);
        return "Sucesso!";
    }

    @PutMapping
    public String atualizarProduto(@RequestBody Produto produto) {
        if(p1.atualizarProduto(produto)) {
            return "Produto atualizado com sucesso!";
        } else {
            return "Falha ao atualizar o produto.";
        }
    }

    public String atualizarCliente(@RequestBody Cliente cliente) {
        if(c1.atualizarCliente(cliente)) {
            return "Cliente atualizado com sucesso!";
        } else {
            return "Falha ao atualizar o cliente.";
        }
    }

    public String atualizarVenda(@RequestBody Venda venda) {
        if(v1.atualizarVenda(venda)) {
            return "Venda atualizada com sucesso!";
        } else {
            return "Falha ao atualizar a venda.";
        }
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@RequestParam Produto p) {
        if(p1.deletarProduto(p)) {
            return "Produto deletado com sucesso!";
        } else {
            return "Falha ao deletar o produto.";
        }
    }


}
