public class AltDistanceStrategy implements DistanceStrategy {
    private static Random rand = new Random();

    @Override
    public int calculateDistance(String fullAddress) {
        Arrays.asList(ProvinceMapper.PROVINCES).stream().filter((s) -> {
            return fullAddress.contains(s);
        }).findFirst().orElseThrow(() -> {
            return new IllegalArgumentException("Province does not exist!");
        });
        return fullAddress.length() + (int)(rand.nextFloat() * 10.0F) / 100;
    }
}


