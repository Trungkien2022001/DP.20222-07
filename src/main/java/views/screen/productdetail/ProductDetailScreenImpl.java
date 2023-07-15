package views.screen.productdetail;

import entity.media.Media;

public class ProductDetailScreenImpl implements ProductDetailScreen {
    private Media media;
    public ProductDetailScreenImpl(Media media) {
        this.media = media;
    }

    @Override
    public void display(Media media) {
        // Hiển thị thông tin chi tiết của sản phẩm
        // Kèm theo lựa chọn số lượng và nút "Add to cart"
    }

}
