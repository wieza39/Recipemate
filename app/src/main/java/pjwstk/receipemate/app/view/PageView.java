package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PageView {
    private int pageNumber;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    List<?> items;
}
