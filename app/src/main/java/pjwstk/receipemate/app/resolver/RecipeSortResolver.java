package pjwstk.receipemate.app.resolver;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.enums.RecipeSort;

@Service
public class RecipeSortResolver {
    public Sort getSort(RecipeSort recipeSort) {
        return switch (recipeSort) {
            case POPULAR -> Sort.by("averageRate").descending();
            case NAME -> Sort.by("name");
            case NEWEST -> Sort.by("updatedAt").descending();
        };
    }
}
