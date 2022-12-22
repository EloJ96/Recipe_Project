package weplus.Recipe_Project.services;

import org.springframework.stereotype.Service;
import weplus.Recipe_Project.domain.Recipe;

import java.util.Set;

@Service
public interface RecipeService {

     Set<Recipe> getRecipes();

}
