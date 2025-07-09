package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private MissoesRepository missoesrepository;

    public MissoesService(MissoesRepository missoesrepository) {
        this.missoesrepository = missoesrepository;
    }

    // Listar todas as missoes
    public List<MissoesModel> listarMissoes() {
        return missoesrepository.findAll();
    }
}
