package com.senai.atividade.model;

import com.senai.atividade.model.Produto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;

import java.util.ArrayList;

public class Venda {

    @Getter
    @Setter

    int idVenda;
    DateTimeFormatterRegistrar dataVenda;

    private static ArrayList<Produto> produto = new ArrayList<Produto>();

    static {
        Produto controleps5 = new Produto(1, "DualSense PS5", 459.99, 500);
        Produto xbox = new Produto(2, "Xbox Series X", 4000.00, 50);

        produto.add(controleps5);
        produto.add(xbox);
    }

    public static ArrayList<Produto> getLista(){
        return produto;
    }

    public void adicionaProduto(Produto p){
        produto.add(p);
    }

}
