package entity.shipping;

import entity.order.Order;

public interface ShippingFeeStrategy {

    public abstract int calculateShippingFee( int distance, Order order);
}
