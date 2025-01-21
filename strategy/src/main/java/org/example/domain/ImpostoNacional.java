package org.example.domain;

import org.example.domain.ImpostoStrategy;

public class ImpostoNacional implements ImpostoStrategy {
    @Override
    public double calcular(int peso) {
        return peso * 0.5;
    }
}
