package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesservice;

    public MissoesController(MissoesService missoesservice) {
        this.missoesservice = missoesservice;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota de Missões";
    }

    // POST -- Mandar uma requisicao para criar uma missao
    // Adicionar missao (CREATE)
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso!";
    }

    // GET -- Mandar uma requisicao para mostrar as missoes
    // Mostrar todas as missoes (READ)
    @GetMapping("/listar")
    public List<MissoesModel> mostrarTodasAsMissoes() {
        return missoesservice.listarMissoes();
    }

    // PUT -- Mandar uma requisicao para alterar uma missao
    // Alterar dados das missoes (UPDATE)
    @PutMapping("/alterar")
    public String alterarMissaoPorId() {
        return "Missao alterada com sucesso!";
    }

    // GET -- Mandar uma requisicao para mostrar uma missao por ID
    // Deletar missao (DELETE)
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso!";
    }


}
