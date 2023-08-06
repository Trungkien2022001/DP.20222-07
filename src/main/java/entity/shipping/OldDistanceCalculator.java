package entity.shipping;

import org.example.DistanceCalculator;

public class OldDistanceCalculator implements  DistanceCalculatorStrategy {
    @Override
    public int calculateDistance(String address, String province) {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        return distanceCalculator.calculateDistance(address, province);
    }
}
