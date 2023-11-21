package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ImageView {
    private String href;

    private String alt;

    private String title;

    private Boolean isMain;
}
