import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlaneTest {
    Plane plane;
    Person person;
    Airline airline;

    @Before
    public void before() {
        plane = new Plane("BA");
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

}
