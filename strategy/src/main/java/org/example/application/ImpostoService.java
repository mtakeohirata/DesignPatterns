package org.example.application;

import org.example.domain.ImpostoStrategy;

public class ImpostoService{
    private ImpostoStrategy impostoStrategy;

    public ImpostoService(ImpostoStrategy impostoStrategy){
        this.impostoStrategy = impostoStrategy;
    }

    public double calcular(final int peso){
        return impostoStrategy.calcular(peso);
    }

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }
}