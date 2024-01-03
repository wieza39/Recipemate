package pjwstk.receipemate.app.view.category;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.view.image.ImageView;

@Getter
@Setter
public class CategoryView {
    private long id;

    private String name;

    private ImageView image;
}
