package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {


    // Esse método é um endpoint que escuta requisições GET na rota "/boasvindas"
    @GetMapping("/boasvindas/ninjas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }


}
