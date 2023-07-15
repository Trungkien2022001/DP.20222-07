public class AlternativeDistanceCalculator {
    private DistanceStrategy distanceStrategy;

    public AlternativeDistanceCalculator(DistanceStrategy distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }

    public int calculateDistance(String fullAddress) {
        // Gọi phương thức tính khoảng cách từ đối tượng Strategy
        int calculatedDistance = distanceStrategy.calculateDistance(fullAddress);

        return calculatedDistance;
    }
}
