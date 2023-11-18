package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
abstract class RepositoryView {
    int pageNumber;
    int pageSize;
    long totalElements;
    int totalPages;
}
