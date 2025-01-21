package com.exemplo.application;

public class NotificacaoService {
    public void enviarNotificacao(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            enviarEmail();
        } else if ("SMS".equalsIgnoreCase(type)) {
            enviarSMS();
        } else {
            notificacaoNaoMapeada();
        }
    }

    public void notificacaoNaoMapeada() {
        System.out.println("Notificacao nao mapeada");
    }

    public void enviarSMS() {
        System.out.println("Enviando SMS de notificacao");
    }

    public void enviarEmail() {
        System.out.println("Enviando e-mail de notificacao");
    }

    public static void main(String[] args) {
        NotificacaoService service = new NotificacaoService();
        service.enviarNotificacao("EMAIL");
        service.enviarNotificacao("SMS");
        service.enviarNotificacao("PUSH"); // Não implementado ainda
    }
}
