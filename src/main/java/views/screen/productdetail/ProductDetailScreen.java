package views.screen.productdetail;

import entity.media.Book;
import entity.media.CD;
import entity.media.DVD;
import entity.media.Media;

public interface ProductDetailScreen {
    void display(Media media);

    // Thêm Factory Method
    static ProductDetailScreen createProductDetailScreen(Media media) {
        if (media instanceof Book) {
            return new BookDetailScreen((Book) media);
        } else if (media instanceof DVD) {
            return new DVDDetailScreen((DVD) media);
        } else if (media instanceof CD) {
            return new CDDetailScreen((CD) media);
        }
        throw new IllegalArgumentException("Invalid media type.");
    }
}
