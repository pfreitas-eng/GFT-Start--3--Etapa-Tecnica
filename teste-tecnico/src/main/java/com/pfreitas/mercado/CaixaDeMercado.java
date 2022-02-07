package com.pfreitas.mercado;

public class CaixaDeMercado {
    
    public static void main(String[] args) {

        Caixa caixa = Caixa.getInstancia();
        
        Produto banana = new Produto("Banana", 0.99, 2);
        Produto energetico = new Produto("Energético", 3, 2);
        Produto arroz = new Produto("Arroz", 20.00, 1);
        Produto chocolate = new Produto("Chocolate", 4.50, 1);
        Produto leite = new Produto("Leite", 3.73, 3);
        Produto abacaxi = new Produto("Abacaxi", 2.40, 2);

        double valorFinalBanana = caixa.calculaValorFinal(banana, 3);
        double valorFinalEnergetico = caixa.calculaValorFinal(energetico, 7);
        double valorFinalArroz = caixa.calculaValorFinal(arroz, 1);
        double valorFinalChocolate = caixa.calculaValorFinal(chocolate, 12);
        double valorFinalLeite = caixa.calculaValorFinal(leite, 5);
        double valorFinalAbacaxi = caixa.calculaValorFinal(abacaxi, 1);

        System.out.println("Nome do Produto | Valor Total");
        System.out.println(String.format("%15s | %11.2f", banana.getNome(), valorFinalBanana));
        System.out.println(String.format("%15s | %11.2f", energetico.getNome(), valorFinalEnergetico));
        System.out.println(String.format("%15s | %11.2f", arroz.getNome(), valorFinalArroz));
        System.out.println(String.format("%15s | %11.2f", chocolate.getNome(), valorFinalChocolate));
        System.out.println(String.format("%15s | %11.2f", leite.getNome(), valorFinalLeite));
        System.out.println(String.format("%15s | %11.2f", abacaxi.getNome(), valorFinalAbacaxi));

    }

}
