package projectdev.service;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectdev.model.Ativo;
import projectdev.model.Ordem;
import projectdev.repository.AtivoRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class AtivoServiceImp implements AtivoService{

    @Autowired
    private AtivoRepository ativoRepository;

    public Ativo findByCodigo(String codigo) {
        Optional<Ativo> obj = ativoRepository.findByCodigo(codigo);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Ativo não encontrado!: " + codigo, Ordem.class.getName()));

    }

    @Override
    public void save(Ativo ativo) {

        ativoRepository.save(ativo);
    }

    @Override
    public void saveAll(List<Ativo> ativos) {
        ativoRepository.saveAll(ativos);
    }

    public void preencheTable(){
        Ativo a = new Ativo("EMB3R", 19.21);
        Ativo a1 = new Ativo("ITUB4", 29.81);
        Ativo a2 = new Ativo("BBAS3", 31.82);
        Ativo a3 = new Ativo("VALE3", 114.62);

        ativoRepository.saveAll(Arrays.asList(a, a1, a2, a3));
    }

}
