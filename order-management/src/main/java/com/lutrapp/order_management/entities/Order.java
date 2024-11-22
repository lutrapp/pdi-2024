package com.lutrapp.order_management.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "orders")
public record Order(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        UUID id,

        @Column(name = "client_id", nullable = false)
        UUID clientId,

        @Column(nullable = false, length = 50)
        String status,

        @Column(name = "total_price", nullable = false)
        BigDecimal totalPrice,

        @Column(name = "created_at", nullable = false)
        LocalDateTime createdAt
) {
    public Order() {
        this(null, null, null, null, null);
    }
}
