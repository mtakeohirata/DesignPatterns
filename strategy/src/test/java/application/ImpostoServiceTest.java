package application;

import org.example.application.ImpostoService;
import org.example.domain.ImpostoInternacional;
import org.example.domain.ImpostoNacional;
import org.example.domain.ImpostoNacionalExpresso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImpostoServiceTest {

    private ImpostoService sut;

    @Test
    public void dadoImpostoNacional_deveMultiplicarPesoPorMeio(){
        final int pesoMock = 2;
        final double impostoExpected = 1;

        sut = new ImpostoService(new ImpostoNacional());
        final double rsp = sut.calcular(pesoMock);

        Assertions.assertEquals(rsp, impostoExpected);
    }

    @Test
    public void dadoImpostoNacionalExpresso_deveMultiplicarPesoPorUm(){
        final int pesoMock = 2;
        final double impostoExpected = 2;

        sut = new ImpostoService(new ImpostoNacionalExpresso());
        final double rsp = sut.calcular(pesoMock);

        Assertions.assertEquals(rsp, impostoExpected);
    }

    @Test
    public void dadoImpostoInternacional_deveMultiplicarPesoPorDois(){
        final int pesoMock = 2;
        final double impostoExpected = 4;

        sut = new ImpostoService(new ImpostoInternacional());
        final double rsp = sut.calcular(pesoMock);

        Assertions.assertEquals(rsp, impostoExpected);
    }
}


