package com.pfreitas.letras;

import java.util.Scanner;

public class ContarLetras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Frase frase = new Frase(scanner.nextLine());

        Palavra ultimaPalavra = frase.getUltimaPalavra();
        
        System.out.println(ultimaPalavra.getNumeroDeCaracteres());

        scanner.close();

    }
    
}
