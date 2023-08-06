package views.screen.productdetail;

import entity.media.Book;
import entity.media.DVD;
import entity.media.Media;

public class DVDDetailScreen implements ProductDetailScreen {

    private DVD dvd;

    public DVDDetailScreen(DVD dvd) {
        this.dvd = dvd;
    }

    @Override
    public void display(Media media) {
        // Hiển thị thông tin chi tiết của DVD
        // ...
    }
}
