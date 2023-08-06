package entity.shipping;

import entity.order.Order;
import org.example.DistanceCalculator;

public class DeliveryInfo {

    protected String name;
    protected String phone;
    protected String province;
    protected String address;
    protected String shippingInstructions;
    protected DistanceCalculator distanceCalculator;
    private ShippingFeeStrategy shippingFeeStrategy;
    private Order order;

    public DeliveryInfo(String name, String phone, String province, String address, String shippingInstructions,
     DistanceCalculator distanceCalculator) {
        this.name = name;
        this.phone = phone;
        this.province = province;
        this.address = address;
        this.shippingInstructions = shippingInstructions;
        this.distanceCalculator = distanceCalculator;
    }
 ////*stamp coupling vì không sử dụng các thuộc tính của order*/
    public void setShippingFee(ShippingFeeStrategy shippingFeeStrategy) {
        this.shippingFeeStrategy = shippingFeeStrategy;
    }

    public int shippingFee(int distance, Order order) {
        return shippingFeeStrategy.calculateShippingFee(distance, order);
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getProvince() {
        return province;
    }

    public String getAddress() {
        return address;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }
}
