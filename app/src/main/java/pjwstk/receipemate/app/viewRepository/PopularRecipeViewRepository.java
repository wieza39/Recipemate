package pjwstk.receipemate.app.viewRepository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.dto.PopularProductDTO;
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
        List<PopularProductDTO> popularProductDTOList = averageRateRecipesPages.getContent().stream().map(averageRateRecipe -> new PopularProductDTO(
                averageRateRecipe.getRecipe().getId(),
                averageRateRecipe.getRecipe().getName(),
                averageRateRecipe.getRecipe().getDescription(),
                averageRateRecipe.getRecipe().getStepsDescriptions(),
                averageRateRecipe.getRecipe().getTimeConsuming(),
                averageRateRecipe.getRecipe().getDifficulty(),
                averageRateRecipe.getRecipe().getCategory(),
                averageRateRecipe.getRecipe().getCreatedAt(),
                averageRateRecipe.getRecipe().getUpdatedAt(),
                averageRateRecipe.getAverageRate()
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