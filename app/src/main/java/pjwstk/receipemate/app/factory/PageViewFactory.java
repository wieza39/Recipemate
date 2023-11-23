package pjwstk.receipemate.app.factory;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.view.PageView;

import java.util.List;

@Service
public class PageViewFactory {
    public PageView make(Page<?> page, List<?> items) {
        return new PageView(
                page.getPageable().getPageNumber(),
                page.getPageable().getPageSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                items
        );
    }
}
