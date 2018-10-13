import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flightInfo;

    @Before
    public void before() {
        flightInfo = new Flight(PlaneType.BOEING, DestinationPlace.ITALY);
    }

    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.BOEING, flightInfo.getPlaneType());
    }

    @Test
    public void flightHasDestination() {
        assertEquals(DestinationPlace.ITALY, flightInfo.getDestination());
    }
    @Test
    public void flightHasNumber() {
        assertEquals(6489, flightInfo.getFlightNumber());
    }

}
