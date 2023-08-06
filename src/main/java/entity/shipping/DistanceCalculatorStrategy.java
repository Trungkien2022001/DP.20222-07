package entity.shipping;

public interface DistanceCalculatorStrategy {
    int calculateDistance(String address, String province);
}
