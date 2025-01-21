package com.exemplo.application;

//Problemas com este código
//- Alta complexidade no método sendNotification: Adicionar um novo tipo de notificação requer alteração no método.
//- Baixa coesão: A lógica de criação está misturada com a lógica de envio.
//- Dificuldade para escalar: Toda vez que um novo tipo é adicionado, o código existente precisa ser modificado.
public class RefatorarNotificacaoService {
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
        RefatorarNotificacaoService service = new RefatorarNotificacaoService();
        service.enviarNotificacao("EMAIL");
        service.enviarNotificacao("SMS");
        service.enviarNotificacao("PUSH"); // Não implementado ainda
    }
}
