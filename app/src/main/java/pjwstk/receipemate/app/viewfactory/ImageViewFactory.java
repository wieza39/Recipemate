package pjwstk.receipemate.app.viewfactory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Image;
import pjwstk.receipemate.app.view.ImageView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageViewFactory {
    public ImageView make(Image image) {
        if (image == null) return null;

        ImageView imageView = new ImageView();

        // TODO: Create ImageHrefResolver service for create image href
        imageView.setHref("https://images.unsplash.com/photo-1564436872-f6d81182df12?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
        imageView.setAlt(image.getAlt());
        imageView.setTitle(image.getTitle());
        imageView.setIsMain(image.getIsMain());

        return imageView;
    }

    public List<ImageView> makeList(List<? extends Image> images) {
        if (images == null) return null;

        return images.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
