package com.pfreitas.letras;

public class Frase {
    
    private String frase;

    public Frase (String frase) {
        this.frase = frase;
    }

    public Palavra getUltimaPalavra() {
        int indiceInicioUltimaPalavra = frase.lastIndexOf(" ") + 1;
        String ultimaPalavra = frase.substring(indiceInicioUltimaPalavra);

        return new Palavra(ultimaPalavra);
    }

    public String getFrase() {
        return frase;
    }


    
}
