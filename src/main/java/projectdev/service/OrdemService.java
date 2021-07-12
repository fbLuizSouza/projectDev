package projectdev.service;

import projectdev.dto.OrdemDTO;
import projectdev.model.Ativo;
import projectdev.model.Ordem;

import java.util.List;

public interface OrdemService {

    void save(Ordem ordem);
    List<Ordem> buscarOrdens(String codigo);
    List<OrdemDTO> montaListaOrdemDto (List<Ordem> listaOrdem);
}
