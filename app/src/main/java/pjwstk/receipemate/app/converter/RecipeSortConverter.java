package pjwstk.receipemate.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pjwstk.receipemate.app.enums.RecipeSort;

@Component
public class RecipeSortConverter implements Converter<String, RecipeSort> {

    @Override
    public RecipeSort convert(String source) {
        if (source.isEmpty()) {
            throw new NullPointerException("Source cannot be null");
        }

        try {
            return RecipeSort.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid recipe sort type");
        }
    }
}
