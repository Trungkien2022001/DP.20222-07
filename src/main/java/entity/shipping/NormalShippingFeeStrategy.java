public class NormalShippingFeeStrategy implements ShippingFeeStrategy {
    @Override
    public int calculateShippingFee(String address, String province) {
        // Thực hiện tính phí vận chuyển theo quy tắc thông thường
        // ...
        return shippingFee;
    }
}
