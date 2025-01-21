package org.example.domain;

import org.example.domain.ImpostoStrategy;

public class ImpostoNacionalExpresso implements ImpostoStrategy {
    @Override
    public double calcular(int peso) {
        return peso * 1;
    }
}
