package views.screen.productdetail;

import entity.media.Book;
import entity.media.Media;

public class  BookDetailScreen implements ProductDetailScreen {

    private Book book;

    public BookDetailScreen(Book book) {
        this.book = book;
    }

    @Override
    public void display(Media media) {
        // Hiển thị thông tin chi tiết của sách
        // ...
    }
}
