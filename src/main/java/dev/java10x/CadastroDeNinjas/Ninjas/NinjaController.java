package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Esse método é um endpoint que escuta requisições GET na rota "/boasvindas"
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado com sucesso!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarNinjas() ;
    }


    // Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
    public List<NinjaModel> mostrarTodosOsNinjasPorId() {
        return ninjaService.listarNinjasPorId(2l);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
        public String alterarNinjasPorId() {
            return "Alterar Ninjas por ID";
        }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarId")
        public String deletarNinjaPorId() {
        return "Ninja deletado com sucesso!";
    }



}
