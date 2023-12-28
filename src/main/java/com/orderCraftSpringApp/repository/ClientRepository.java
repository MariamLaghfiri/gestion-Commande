package com.orderCraftSpringApp.repository;

import com.orderCraftSpringApp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
