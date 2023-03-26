package com.ms.email.enums;

public enum StatusEmail {

    ENVIADO("Email enviado com sucesso."),
    ERRO("Falha ao enviar email.");

    private String description;

    StatusEmail(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
