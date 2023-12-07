package pjwstk.receipemate.app.viewfactory.category;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.CategoryImage;
import pjwstk.receipemate.app.view.category.CategoryImageView;

@Service
public class CategoryImageViewFactory {

    public CategoryImageView make(CategoryImage categoryImage) {
        return new CategoryImageView(
                "https://images.unsplash.com/photo-1564436872-f6d81182df12?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                categoryImage.getAlt(),
                categoryImage.getTitle()
        );
    }
}
