package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {

    private MissoesRepository missoesrepository;
    private MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesrepository, MissoesMapper missoesMapper) {
        this.missoesrepository = missoesrepository;
        this.missoesMapper = missoesMapper;
    }

    // Adicionar missao (CREATE)
    public MissoesDTO criarMissao(MissoesDTO missoesDTO) {
        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
        missoesModel = missoesrepository.save(missoesModel);
        return missoesMapper.map(missoesModel);
    }

    // Listar todas as missoes
    public List<MissoesDTO> listarMissoes() {
        List<MissoesModel> missoes = missoesrepository.findAll();
        return missoes.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }

    // Listar todas as missoes por ID
    public MissoesDTO listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesPorId = missoesrepository.findById(id);
        return missoesPorId.map(missoesMapper::map).orElse(null);
    }

    // Alterar dados de uma missao
    public MissoesDTO atualizarMissao(Long id, MissoesDTO missoesDTO) {
        Optional<MissoesModel> missaoExistente = missoesrepository.findById(id);
        if (missaoExistente.isPresent()) {
            MissoesModel missaoAtualizada = missoesMapper.map(missoesDTO);
            missaoAtualizada.setId(id);
            MissoesModel missaoSalva = missoesrepository.save(missaoAtualizada);
            return missoesMapper.map(missaoSalva);
        }
        return null;
    }


    // Deletar missao por ID
    public void deletarMissoaoPorId(Long id) {
        missoesrepository.deleteById(id);
    }
}
