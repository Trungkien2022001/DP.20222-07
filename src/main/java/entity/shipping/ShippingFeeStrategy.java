public interface ShippingFeeStrategy {
    int calculateShippingFee(String address, String province);
}
