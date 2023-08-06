package entity.shipping;

import org.example.AlternativeDistanceCalculator;

public class NewDistanceCalculator implements  DistanceCalculatorStrategy {
    @Override
    public int calculateDistance(String address, String province) {
        AlternativeDistanceCalculator distanceCalculator = new AlternativeDistanceCalculator();
        return distanceCalculator.calculateDistance(address);
    }
}
