package com.pfreitas.impostos;

public class ICMS implements Imposto {
    
    @Override
    public double calculaImposto(double valor) {
        return valor * 0.30;
    }

}
