package com.pfreitas.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabalhandoArrays {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        while (!entrada.isEmpty()) {
            int arraySize;
            String[] arrayStrings = entrada.split(" ");
            arraySize = arrayStrings.length;
            Integer[] arrayIntegers = new Integer[arraySize];
            for(int i=0; i<arraySize; i++) {
                arrayIntegers[i] = Integer.parseInt(arrayStrings[i]);
            }

            List<Integer> lista = Arrays.asList(arrayIntegers);

            if (lista.isEmpty()){
                System.out.println("Erro na entrada. Deve conter numeros inteiros");
            } else {
                int soma=0;
                for (Integer i:lista) {
                    soma += i;
                }

                int maiorNumero = lista.get(0);
                for (Integer i:lista) {
                    maiorNumero = i>maiorNumero?i:maiorNumero;
                }

                int menorNumero = lista.get(0);
                for (Integer i:lista) {
                    menorNumero = i<menorNumero?i:menorNumero;
                }

                double media = (double)soma / lista.size();        

                double mediana;
                int indiceMediana = lista.size()/2;
            
                if (lista.size()%2==0){
                    mediana = (double)(lista.get(indiceMediana) + (double)lista.get(indiceMediana+1))/2;
                } else {
                    mediana = (double)lista.get(indiceMediana);
                }

                System.out.println("Soma de todos os numeros: " + soma);
                System.out.println("Maior numero: " + maiorNumero);
                System.out.println("Menor numero: " + menorNumero);
                System.out.println("Media dos valores: " + media);
                System.out.println("Mediana dos valores: " + mediana);
            }

            entrada = scanner.nextLine();
        }
        scanner.close(); 
    }

}
