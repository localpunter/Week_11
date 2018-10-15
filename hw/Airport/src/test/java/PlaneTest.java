import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Plane capacity;
    Person person;
    Airline airline;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA, "BA");
        capacity = new Plane(PlaneType.CESSNA, "BA");
        person = new Person();
        airline = new Airline();
    }



    @Test
    public void numberOfPassengers() {
        assertEquals(0, plane.getPassengers());
    }

    @Test
    public void addPassenger() {
        plane.addPassenger(person);
        assertEquals(1, plane.getPassengers());
    }

    @Test
    public void removePassenger() {
        plane.addPassenger(person);
        assertEquals(1, plane.getPassengers());
        plane.removePassenger();
        assertEquals(0, plane.getPassengers());
    }

    @Test
    public void planeHasAirline() {
        assertEquals("BA", plane.getAirline());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(4, plane.getPlaneCapacity());
    }



}
