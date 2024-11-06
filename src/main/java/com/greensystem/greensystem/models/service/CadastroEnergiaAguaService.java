/*package com.greensystem.greensystem.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroEnergiaAguaService {

    @Autowired
    private ArmazenamentoRepository armazenamentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FontesNaturaisRepository fontesNaturaisRepository;

    // Método para cadastrar dados de energia e água
    public boolean cadastroEnergiaAgua(Long clienteId, Long fontesNaturaisId, float gastos, float coleta) {
        // Busca o Cliente e FontesNaturais pelo ID
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        FontesNaturais fontesNaturais = fontesNaturaisRepository.findById(fontesNaturaisId).orElse(null);

        if (cliente == null || fontesNaturais == null) {
            System.out.println("Cliente ou Fonte Natural não encontrado.");
            return false;
        }

        // Cria um novo objeto Armazenamento
        Armazenamento armazenamento = new Armazenamento();
        armazenamento.setCliente(cliente);
        armazenamento.setFontesNaturais(fontesNaturais);
        armazenamento.setGastos(gastos);
        armazenamento.setColeta(coleta);

        try {
            // Salva o objeto no banco de dados
            armazenamentoRepository.save(armazenamento);
            System.out.println("Inserção de dados com sucesso na tabela armazenamento!");
            return true;
        } catch (Exception e) {
            System.out.println("Dados não inseridos. Exceção: " + e.toString());
            return false;
        }
    }
}
*/
