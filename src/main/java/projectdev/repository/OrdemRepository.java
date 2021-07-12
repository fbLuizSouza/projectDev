package projectdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectdev.model.Ativo;
import projectdev.model.Ordem;

import java.util.List;


@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Integer> {

    List<Ordem> findAllByCodAtivoEquals(String codigo);
}
