package pjwstk.receipemate.app.view;

import lombok.Getter;
import pjwstk.receipemate.app.dto.PopularProductDTO;

import java.util.List;

@Getter
public class PopularRecipeRepositoryView extends RepositoryView {
    List<PopularProductDTO> recipes;

    public PopularRecipeRepositoryView(List<PopularProductDTO> popularProductDTOList, int pageNumber, int pageSize, long totalElements, int totalPages) {
        super(pageNumber, pageSize, totalElements, totalPages);
        this.recipes = popularProductDTOList;
    }
}
