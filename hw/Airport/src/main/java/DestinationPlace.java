public enum DestinationPlace {
    LONDON(7532),
    AUCKLAND(8976),
    ISLAY(2302),
    ITALY(6489);

    private final int flightInfo;

    DestinationPlace(int flightInfo) {
        this.flightInfo = flightInfo;
    }

    public int getFlightInfo() {
        return flightInfo;
    }
}
