package projectdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectdev.dto.OrdemDTO;
import projectdev.model.Ordem;
import projectdev.repository.OrdemRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class OrdemServiceImp implements OrdemService{

    @Autowired
    private OrdemRepository ordemRepository;


    @Override
    public void save(Ordem ordem) {

        ordemRepository.save(ordem);
    }

    @Override
    public List<Ordem> buscarOrdens(String codigo) {
        return ordemRepository.findOrdemByCodAtivo(codigo);
    }

    public void preencheTabelaOrdem(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate s = LocalDate.now();
        Ordem a = new Ordem("EMB3R", 2, 20, 400.00, s);
        ordemRepository.save(a);
    }

    @Override
    public List<OrdemDTO> montaListaOrdemDto(List<Ordem> listaOrdem) {

        OrdemDTO ordemDTO = new OrdemDTO();
        return null;
    }
}
