package weplus.Recipe_Project.repositories;

import org.springframework.data.repository.CrudRepository;
import weplus.Recipe_Project.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
