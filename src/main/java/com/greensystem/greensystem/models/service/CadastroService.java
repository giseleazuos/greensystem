package com.greensystem.greensystem.models.service;

import com.greensystem.greensystem.models.entity.Cliente;
import com.greensystem.greensystem.models.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Método para verificar se o login já está em uso
    public boolean isLoginJaExistente(String login) {
        return clienteRepository.findByLogin(login) != null;
    }

    // Método para salvar um novo cliente
    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    // Método para verificar se o CNPJ já está cadastrado
    public boolean isCnpjJaExistente(String cnpj) {
        return clienteRepository.findByCnpj(cnpj) != null;
    }
}

