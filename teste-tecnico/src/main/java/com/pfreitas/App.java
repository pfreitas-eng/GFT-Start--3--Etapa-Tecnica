package com.pfreitas;

import java.util.Scanner;

import com.pfreitas.letras.ContarLetras;

public final class App {
    private App() {}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContarLetras contarLetras = new ContarLetras(scanner);
        contarLetras.executar();
    }
}
