package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Listar todas as missoes por ID
    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesPorId = missoesrepository.findById(id);
        return missoesPorId.orElse(null);
    }
}
