package com.senai.atividade.db;

import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Produto> produtos;
    private List<Cliente> cliente;
    private List<Venda> venda;

    public BancoDeDados() {
        this.produtos = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.venda = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Produto p) {
        produtos.add(p);
    }

    public void insert(Cliente c) {
        cliente.add(c);
    }

    public void insert(Venda v) {
        venda.add(v);
    }

    // Busca um produto pelo ID
    public Produto findOne(int id) {
        for (Produto p : produtos) {
            if (p.getIdProduto() == id) {
                return p;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Produto> buscarProdutos() {
        return new ArrayList<>(produtos);
    }

    public List<Cliente> buscarClientes() {
        return new ArrayList<>(cliente);
    }

    public List<Venda> buscarVendas() {
        return new ArrayList<>(venda);
    }

    // Atualiza um produto existente na lista
    public boolean update(Produto p) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto() == p.getIdProduto()) {
                produtos.set(i, p);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }
    public boolean update2(Cliente c) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getIdCliente() == c.getIdCliente()) {
                cliente.set(i, c);
                return true;
            }
        } return false;
    }

    public boolean update3(Venda v) {
        for (int i = 0; i < venda.size(); i++) {
            if (venda.get(i).getIdVenda() == v.getIdVenda()) {
                venda.set(i, v);
                return true;
            }
        } return false;
    }

    // Remove um produto pelo ID
    public boolean delete(int idProduto) {
        return produtos.removeIf(p -> p.getIdProduto() == idProduto);
    }

    public boolean delete2(int idCliente) {
        return cliente.removeIf(c -> c.getIdCliente() == idCliente);
    }

    public boolean delete3(int idVenda) {
        return venda.removeIf(v -> v.getIdVenda() == idVenda);
    }

}