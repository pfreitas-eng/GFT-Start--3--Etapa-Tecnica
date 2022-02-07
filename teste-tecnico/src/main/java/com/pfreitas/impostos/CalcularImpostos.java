package com.pfreitas.impostos;

import java.util.Scanner;

public class CalcularImpostos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valorBase = scanner.nextDouble();

        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();

        double icmsCalculado = icms.calculaImposto(valorBase);
        double ipiCalculado = ipi.calculaImposto(valorBase);
        double cofinsCalculado = cofins.calculaImposto(valorBase);

        System.out.println(String.format("ICMS: %.2f", icmsCalculado));
        System.out.println(String.format("IPI:  %.2f", ipiCalculado));
        System.out.println(String.format("ICMS: %.2f", cofinsCalculado));
        
        double impostoTotal = icmsCalculado + ipiCalculado + cofinsCalculado;
        double valorFinal = valorBase + impostoTotal;
        System.out.println(String.format("Valor Final: %.2f", valorFinal));

        scanner.close();
    }

}
