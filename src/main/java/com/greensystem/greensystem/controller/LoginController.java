package com.greensystem.greensystem.controller;

import com.greensystem.greensystem.models.repository.ClienteRepository;
import com.greensystem.greensystem.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/login")
    public String login() {
        return "login";  // Nome do arquivo HTML (login.html)
    }

    @PostMapping("/login")
    public String login(@RequestParam("login") String login,
                        @RequestParam("senha") String senha, Model model) {
    
        // Verifica se o cliente existe com o login e senha fornecidos
        Cliente cliente = clienteRepository.findByLoginAndSenha(login, senha);
        if (cliente != null) {
            return "redirect:/home";  // Redireciona para a página principal após o login
        } else {
            model.addAttribute("error", "Usuário ou senha incorretos");
            return "login";  // Retorna para a página de login com mensagem de erro
        }
    }
}

