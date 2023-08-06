package entity.shipping;

import entity.order.Order;

public class ShippingFeeNew implements ShippingFeeStrategy {

    private Order order;
    private String address;
    private String province;

    public int calculateShippingFee (int distance, Order order) {
        distance = distanceCalculator.calculateDistance(address, province);
        return (int) (distance * order.getHeight() *order.getWeight() * order.getWidth()/6000);
    }
 
    // public void setHeight( double height) {
    //     this.height = height;
    // }
    // public void setWidth( double width) {
    //     this.width = width;
    // }
    // public void setLength( double length) {
    //     this.length = length;
    // }
   
}
