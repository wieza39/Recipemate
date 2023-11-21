package pjwstk.receipemate.app.factory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Image;
import pjwstk.receipemate.app.view.ImageView;

@Service
public class ImageViewFactory {
    public ImageView make(Image image) {
        // TODO: Create ImageHrefGenerator service for create image href

        if (image == null) return null;

        return new ImageView(
                "https://images.unsplash.com/photo-1564436872-f6d81182df12?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                image.getAlt(),
                image.getTitle(),
                null
        );
    }
}