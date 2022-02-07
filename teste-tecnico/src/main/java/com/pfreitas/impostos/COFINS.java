package com.pfreitas.impostos;

public class COFINS implements Imposto {
        
    @Override
    public double calculaImposto(double valor) {
        return valor>17000?valor*0.08:0;
    }

}
