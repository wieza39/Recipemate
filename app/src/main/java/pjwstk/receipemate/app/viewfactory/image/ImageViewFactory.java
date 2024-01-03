package pjwstk.receipemate.app.viewfactory.image;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Image;
import pjwstk.receipemate.app.view.image.ImageView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageViewFactory {
    public ImageView make(Image image) {
        if (image == null) return null;

        ImageView imageView = new ImageView();

        imageView.setHref(image.getHref());
        imageView.setAlt(image.getAlt());
        imageView.setTitle(image.getTitle());

        return imageView;
    }

    public List<ImageView> makeList(List<? extends Image> images) {
        if (images == null || images.isEmpty()) return null;

        return images.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
