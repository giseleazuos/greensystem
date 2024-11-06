package com.greensystem.greensystem.models.repository;

import com.greensystem.greensystem.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    // Método customizado para buscar cliente por login e senha
    Cliente findByLoginAndSenha(String login, String senha);

    Cliente findByLogin(String login);

    Cliente findByCnpj(String cnpj);
}
