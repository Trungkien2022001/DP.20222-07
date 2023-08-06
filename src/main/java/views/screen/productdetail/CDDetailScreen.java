package views.screen.productdetail;

import entity.media.Book;
import entity.media.CD;
import entity.media.Media;

public class CDDetailScreen implements ProductDetailScreen {

    private CD cd;

    public CDDetailScreen(CD cd) {
        this.cd = cd;
    }

    @Override
    public void display(Media media) {
        // Hiển thị thông tin chi tiết của CD
        // ...
    }
}
