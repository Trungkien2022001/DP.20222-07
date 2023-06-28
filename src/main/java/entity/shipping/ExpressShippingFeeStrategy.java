public class ExpressShippingFeeStrategy implements ShippingFeeStrategy {
    @Override
    public int calculateShippingFee(String address, String province) {
        // Thực hiện tính phí vận chuyển theo quy tắc vận chuyển nhanh
        // ...
        return shippingFee;
    }
}
