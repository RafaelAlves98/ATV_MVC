package com.senai.atividade.model;

import com.senai.atividade.model.Produto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;

import java.util.ArrayList;

public class Venda {

    @Getter
    @Setter

    Integer idVenda;
    DateTimeFormatterRegistrar dataVenda;
}
