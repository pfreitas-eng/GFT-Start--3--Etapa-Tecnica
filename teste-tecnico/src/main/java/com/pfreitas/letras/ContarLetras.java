package com.pfreitas.letras;

import java.util.Scanner;

import com.pfreitas.Executavel;

public class ContarLetras implements Executavel {

    private Scanner scanner;

    public ContarLetras(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        
        String entrada = scanner.nextLine();

        int indiceInicioUltimaPalavra = entrada.lastIndexOf(" ") + 1;

        String ultimaPalavra = entrada.substring(indiceInicioUltimaPalavra);

        int numeroCaracteresUltimaPalavra = ultimaPalavra.length();

        System.out.println(numeroCaracteresUltimaPalavra);

    }
    
}
