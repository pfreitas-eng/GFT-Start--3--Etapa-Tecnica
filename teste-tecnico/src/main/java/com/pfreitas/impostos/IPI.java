package com.pfreitas.impostos;

public class IPI implements Imposto {
        
    @Override
    public double calculaImposto(double valor) {
        return valor<25000?valor*0.05:valor*0.10;
    }

}
