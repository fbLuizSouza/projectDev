package projectdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectdev.model.Ativo;

import java.util.Optional;

@Repository
public interface AtivoRepository extends JpaRepository<Ativo, String> {

    Optional<Ativo> findByCodigo(String codigo);
}
