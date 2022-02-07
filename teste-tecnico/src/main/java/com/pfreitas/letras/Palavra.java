package com.pfreitas.letras;

public class Palavra {
    
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public int getNumeroDeCaracteres() {
        return this.palavra.length();
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return this.palavra;
    }

}
