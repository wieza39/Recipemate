package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class RepositoryView {
    Integer pageNumber;
    Integer pageSize;
    Long totalElements;
    Integer totalPages;
}
