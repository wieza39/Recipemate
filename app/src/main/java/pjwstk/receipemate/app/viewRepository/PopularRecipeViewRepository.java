package pjwstk.receipemate.app.viewRepository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.dto.PopularRecipeDTO;
import pjwstk.receipemate.app.dto.RecipeImageDTO;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.PopularRecipeRepositoryView;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PopularRecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;

    public PopularRecipeViewRepository(AverageRateRecipeRepository averageRateRecipeRepository) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
    }

    public PopularRecipeRepositoryView getList(Pageable pageable) {
        Page<AverageRateRecipe> averageRateRecipesPages = this.averageRateRecipeRepository.getAll(pageable);

        // TODO: Create ImageHrefFactory service for create image href

        List<PopularRecipeDTO> popularProductDTOList = averageRateRecipesPages.getContent().stream().map(averageRateRecipe -> new PopularRecipeDTO(
                averageRateRecipe.getRecipe().getId(),
                averageRateRecipe.getRecipe().getName(),
                averageRateRecipe.getRecipe().getDescription(),
                averageRateRecipe.getRecipe().getTimeConsuming(),
                averageRateRecipe.getRecipe().getDifficulty(),
                averageRateRecipe.getRecipe().getCategory(),
                averageRateRecipe.getRecipe().getCreatedAt(),
                averageRateRecipe.getRecipe().getUpdatedAt(),
                averageRateRecipe.getAverageRate(),
                new RecipeImageDTO(
                        "https://images.unsplash.com/photo-1564436872-f6d81182df12?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        averageRateRecipe.getImage().getAlt(),
                        averageRateRecipe.getImage().getTitle(),
                        null
                )
        )).collect(Collectors.toList());

        return new PopularRecipeRepositoryView(
                popularProductDTOList,
                averageRateRecipesPages.getPageable().getPageNumber(),
                averageRateRecipesPages.getPageable().getPageSize(),
                averageRateRecipesPages.getTotalElements(),
                averageRateRecipesPages.getTotalPages()
        );
    }
}