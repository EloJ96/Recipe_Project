package weplus.Recipe_Project.repositories;

import org.springframework.data.repository.CrudRepository;
import weplus.Recipe_Project.domain.Recipe;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findById(Long aLong);
}
