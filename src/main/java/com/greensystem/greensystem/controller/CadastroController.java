package com.greensystem.greensystem.controller;

import com.greensystem.greensystem.models.entity.Cliente;
import com.greensystem.greensystem.models.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    // Exibe o formulário de cadastro
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Retorna a página cadastro.html
    }

    // Processa o cadastro de novo cliente
    @PostMapping("/cadastro")
    public String cadastrarCliente(@RequestParam("cnpj") String cnpj,
                                   @RequestParam("nome") String nome,
                                   @RequestParam("endereco") String endereco,
                                   @RequestParam("telefone1") String telefone1,
                                   @RequestParam("telefone2") String telefone2,
                                   @RequestParam("telefone3") String telefone3,
                                   @RequestParam("login") String login,
                                   @RequestParam("senha") String senha,
                                   Model model) {

        // Verifica se o login já está cadastrado
        if (cadastroService.isLoginJaExistente(login)) {
            model.addAttribute("error", "Este login já está em uso.");
            return "cadastro";  // Retorna para a página de cadastro com erro
        }

            // Verifica se o CNPJ já está cadastrado
        if (cadastroService.isCnpjJaExistente(cnpj)) {
            model.addAttribute("error", "Este CNPJ já está cadastrado.");
            return "cadastro";  // Retorna para a página de cadastro com erro
        }

        // Cria um novo cliente
        Cliente novoCliente = new Cliente();
        novoCliente.setCnpj(cnpj);
        novoCliente.setNome(nome);
        novoCliente.setEndereco(endereco);
        novoCliente.setTelefone1(telefone1);
        novoCliente.setTelefone2(telefone2);
        novoCliente.setTelefone3(telefone3);
        novoCliente.setLogin(login);
        novoCliente.setSenha(senha);  // Senha sem criptografia por enquanto

        // Chama o serviço para salvar o novo cliente no banco de dados
        cadastroService.salvarCliente(novoCliente);

        // Redireciona para a página de login após o cadastro
        return "redirect:/login";
    }
}




