package com.pfreitas.mercado;

public class Caixa {

    private static class InstanceHolder {
        public static Caixa instancia = new Caixa();
    }

    private Caixa() {}

    public static Caixa getInstancia() {
        return InstanceHolder.instancia;
    }


 
    public double calculaValorFinal(Produto produto, int qtd) {
        double valorProdutos = produto.getValor() * qtd;
        double taxaDesconto = calculaTaxaDesconto(produto, qtd);
        double valorFinal = valorProdutos * (1 - taxaDesconto);

        return valorFinal;
    }

    private double calculaTaxaDesconto(Produto produto, int qtd) {
        int tipoProduto = produto.getTipo();
        double taxaDesconto = 0;
        switch (tipoProduto) {
            case 1:
                taxaDesconto = 0.1;
            case 2:
                taxaDesconto = 0.2;
            case 3:
                taxaDesconto = (qtd>5)?0.1:0;
        }
        return taxaDesconto;
    }
}
