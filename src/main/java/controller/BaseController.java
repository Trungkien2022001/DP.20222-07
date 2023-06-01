package controller;

import java.util.List;

import entity.cart.Cart;
import entity.cart.CartItem;
import entity.media.Media;

/**
 * This class is the base controller for our AIMS project
 * 
 * @author nguyenlm
 */
public class BaseController {

    // có nhiều lớp con kế thừa từ cùng lớp Media và thực hiện các phương thức khác
    // nhau, chuyển thành Template Method giúp tái sử dụng mã, tăng tính linh hoạt
    // và giảm sự phức tạp của code , chuyển nó thành abstract class

    /**
     * The method checks whether the Media in Cart, if it were in, we will return
     * the CartMedia else return null
     * 
     * @param media
     * @return CartMedia or null
     */
    public CartItem checkMediaInCart(Media media) {
        return SessionInformation.cartInstance.checkMediaInCart(media);
    }

    /**
     * This method gets the list of items in cart
     * 
     * @return List[CartMedia]
     */
    public List getListCartMedia() {
        return SessionInformation.cartInstance.getListMedia();
    }
}
