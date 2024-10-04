package com.PorjetMaven.start.Erreur;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}