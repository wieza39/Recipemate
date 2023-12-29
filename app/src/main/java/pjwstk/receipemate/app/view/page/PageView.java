package pjwstk.receipemate.app.view.page;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageView {
    private int pageNumber;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    List<?> items;
}
