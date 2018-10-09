import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    Salmon salmon;
    River river;


    @Before
    public void before() {
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
    }

    @Test
    public void foodCount() {
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void eat() {
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test

    public void sleep() {
        bear.eat(salmon);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void eatFromRiver() {
        // add fish to river
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
        // take fish from river
        // bear eats fish
        bear.eatFromRiver(river);
        assertEquals(0, river.fishCount());
        assertEquals(1, bear.foodCount());
    }

}
