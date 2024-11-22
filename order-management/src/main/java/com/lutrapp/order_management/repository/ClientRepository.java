package com.lutrapp.order_management.repository;

import com.lutrapp.order_management.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}

