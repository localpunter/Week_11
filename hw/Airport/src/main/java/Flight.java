public class Flight {
    private PlaneType plane;
    private DestinationPlace flightInfo;


    public Flight(PlaneType plane, DestinationPlace flightInfo) {
        this.plane = plane;
        this.flightInfo = flightInfo;

    }


    public PlaneType getPlaneType() {
        return plane;
    }

    public DestinationPlace getDestination() {
        return flightInfo;
    }

    public int getFlightNumber() {
        return flightInfo.getFlightInfo();
    }
}
