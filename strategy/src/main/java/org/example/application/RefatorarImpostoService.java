package org.example.application;

public class RefatorarImpostoService {
    public double calcular(String tipoImposto, int peso){
        if ("normal".equals(tipoImposto)){
            return peso * 1.5;
        }
        if ("expresso".equals(tipoImposto)){
            return peso * 2;
        }
        if ("internacional".equals(tipoImposto)) {
            return peso * 3;
        }

        throw new IllegalArgumentException("Tipo de imposto não conhecido: " + tipoImposto);
    }
}
