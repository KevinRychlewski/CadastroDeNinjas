package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaDTO {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String imgUrl;
    private MissoesModel missoes;
    private String rank;

}
