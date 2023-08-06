package entity.shipping;

import entity.order.Order;
import org.example.DistanceCalculator;

public class ShippingFeeOld implements ShippingFeeStrategy {

    protected DistanceCalculator distanceCalculator;
    
    private Order order; 
    private String address;
    private String province;

    public int calculateShippingFee(int distance, Order order) {
        distance = distanceCalculator.calculateDistance(address, province);
        return (int) (distance * 1.2);
    }
}
