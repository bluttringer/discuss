package com.ben.discuss.user.management.entities;

public record User(
        String email,
        String firstName,
        String lastName,
        String encryptedPassword) {
}
