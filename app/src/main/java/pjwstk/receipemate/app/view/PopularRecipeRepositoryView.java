package pjwstk.receipemate.app.view;

import lombok.Getter;
import pjwstk.receipemate.app.dto.PopularRecipeDTO;

import java.util.List;

@Getter
public class PopularRecipeRepositoryView extends RepositoryView {
    List<PopularRecipeDTO> recipes;

    public PopularRecipeRepositoryView(List<PopularRecipeDTO> popularProductDTOList, int pageNumber, int pageSize, long totalElements, int totalPages) {
        super(pageNumber, pageSize, totalElements, totalPages);
        this.recipes = popularProductDTOList;
    }
}
