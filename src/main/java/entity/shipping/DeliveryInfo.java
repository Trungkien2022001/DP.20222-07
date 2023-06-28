package entity.shipping;
import entity.shipping.ExpressShippingFeeStrategy;
import entity.shipping.NormalShippingFeeStrategy;
import entity.shipping.ShippingFeeStrategy;
import controller.DistanceCalculator;
import entity.order.Order;

public class DeliveryInfo {

    protected String name;
    protected String phone;
    protected String province;
    protected String address;
    protected String shippingInstructions;
    protected DistanceCalculator distanceCalculator;
    protected ShippingFeeStrategy shippingFeeStrategy;

    public DeliveryInfo(String name, String phone, String province, String address, String shippingInstructions, DistanceCalculator distanceCalculator,ShippingFeeStrategy shippingFeeStrategy) {
        this.name = name;
        this.phone = phone;
        this.province = province;
        this.address = address;
        this.shippingInstructions = shippingInstructions;
        this.distanceCalculator = distanceCalculator;

         // Thiết lập shippingFeeStrategy là ExpressShippingFeeStrategy
       this.shippingFeeStrategy = shippingFeeStrategy;
    }

    public int calculateShippingFee() {
    double distance = distanceCalculator.calculateDistance(address, province);
    int shippingFee = shippingFeeStrategy.calculateShippingFee(distance);
    return shippingFee;
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
