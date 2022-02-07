package com.pfreitas.mercado;

import java.security.InvalidParameterException;

public class Produto {
    
    private String nome;
    private double valor;
    private int tipo;

    public Produto(String nome, double valor, int tipo) {
        this.nome = nome;
        this.valor = valor;

        switch (tipo) {
            case 1:
            case 2:
            case 3:
                this.tipo = tipo;
                break;
            default:
                throw new InvalidParameterException("O tipo do produto deve ser um número Inteiro entre 1, 2 e 3.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
