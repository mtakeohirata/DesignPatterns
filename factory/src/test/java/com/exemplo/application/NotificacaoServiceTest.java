package com.exemplo.application;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class NotificacaoServiceTest {

    public static NotificacaoService sut;

    @BeforeAll
    public static void setUp(){
        sut = spy(NotificacaoService.class);
    }

    @Test
    public void dadoNotificacaoEmail_deveEnviarEmail(){
        sut.enviarNotificacao("EMAIL");

        verify(sut, times(1)).enviarEmail();
        verify(sut, times(0)).enviarSMS();
        verify(sut, times(0)).notificacaoNaoMapeada();
    }
    @Test
    public void dadoNotificacaoSMS_deveEnviarSMS(){
        sut.enviarNotificacao("SMS");

        verify(sut, times(1)).enviarSMS();
        verify(sut, times(0)).enviarEmail();
        verify(sut, times(0)).notificacaoNaoMapeada();
    }
}