package com.devsuperio.apiCliente.repositories;

import com.devsuperio.apiCliente.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
