package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesservice;
    private MissoesMapper missoesMapper;

    public MissoesController(MissoesService missoesservice, MissoesMapper missoesMapper) {
        this.missoesservice = missoesservice;
        this.missoesMapper = missoesMapper;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota de Missões";
    }

    // POST -- Mandar uma requisicao para criar uma missao
    // Adicionar missao (CREATE)
    @PostMapping("/criar")
    public MissoesDTO criarMissao(@RequestBody MissoesDTO missoesDTO) {
        return missoesservice.criarMissao(missoesDTO);
    }

    // GET -- Mandar uma requisicao para mostrar as missoes
    // Mostrar todas as missoes (READ)
    @GetMapping("/listar")
    public List<MissoesDTO> mostrarTodasAsMissoes() {
        return missoesservice.listarMissoes();
    }

    // Mostrar todas as missoes por ID
    @GetMapping("/listar/{id}")
    public MissoesDTO listarMissoesPorId(@PathVariable Long id) {
        return missoesservice.listarMissoesPorId(id);
    }

    // PUT -- Mandar uma requisicao para alterar uma missao
    // Alterar dados das missoes (UPDATE)
    @PutMapping("/alterar")
    public MissoesDTO alterarMissaoPorId(@PathVariable Long id, @RequestBody MissoesDTO missaoAtualizada) {
        return missoesservice.atualizarMissao(id, missaoAtualizada);
    }

    // GET -- Mandar uma requisicao para mostrar uma missao por ID
    // Deletar missao (DELETE)
    @DeleteMapping("/deletar")
    public void deletarMissao(Long id) {
        missoesservice.deletarMissoaoPorId(id);
    }


}
