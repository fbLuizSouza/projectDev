package projectdev.service;

import projectdev.model.Ativo;

import java.util.List;

public interface AtivoService {

    Ativo findByCodigo(String codigo);
    void save(Ativo ativo);
    void saveAll(List<Ativo> ativos);
}
