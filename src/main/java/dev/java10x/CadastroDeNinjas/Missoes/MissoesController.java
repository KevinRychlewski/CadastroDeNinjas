package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/boasvindas/missoes")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota de Missões";
    }

    // Adicionar missao (CREATE)

    // Mostrar todas as missoes (READ)

    // Mostrar missao por ID (READ)

    // Alterar dados das missoes (UPDATE)


}
