package pjwstk.receipemate.app.viewfactory.page;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.view.page.PageView;

import java.util.List;

@Service
public class PageViewFactory {
    public PageView make(Page<?> page, List<?> items) {
        PageView pageView = new PageView();

        pageView.setPageNumber(page.getPageable().getPageNumber() + 1);
        pageView.setPageSize(page.getPageable().getPageSize());
        pageView.setTotalElements(page.getTotalElements());
        pageView.setTotalPages(page.getTotalPages());
        pageView.setItems(items);

        return pageView;
    }
}
