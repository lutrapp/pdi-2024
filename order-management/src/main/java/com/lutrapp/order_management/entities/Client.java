package com.lutrapp.order_management.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "clients")
public record Client(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        UUID id,

        @Column(nullable = false)
        String name,

        @Column(nullable = false, unique = true)
        String email,

        @Column(nullable = false)
        String password
) {
    // JPA exige um construtor sem argumentos para funcionar
    public Client() {
        this(null, null, null, null);
    }
}
