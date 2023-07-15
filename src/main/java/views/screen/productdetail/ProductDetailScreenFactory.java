package views.screen.productdetail;

import entity.media.Media;

public class ProductDetailScreenFactory {
    public ProductDetailScreen createProductDetailScreen(Media media) {
        return new ProductDetailScreenImpl(media);
    }

}
