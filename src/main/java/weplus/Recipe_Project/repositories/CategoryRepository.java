package weplus.Recipe_Project.repositories;

import org.springframework.data.repository.CrudRepository;
import weplus.Recipe_Project.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
