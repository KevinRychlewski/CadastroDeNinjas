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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarNinjas() ;
    }


    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID/{id}")
    public NinjaModel alterarNinjasPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
            return ninjaService.atualizarNinja(id, ninjaAtualizado);
        }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);

    }



}
