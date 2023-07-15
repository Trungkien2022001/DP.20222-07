package entity.shipping;

public class CalShippingFeeNew implements ShippingFeeStrategy {
    public int calculateShippingFee (int distance) {
        return (int) (distance * bulkiness());
    }
    private double height, width, length;
    public void setHeight( double height) {
        this.height = height;
    }
    public void setWidth( double width) {
        this.width = width;
    }
    public void setLength( double length) {
        this.length = length;
    }
    public int bulkiness() {
        return (int) length*width*height/6000;
    }
}
