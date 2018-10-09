import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;


    @Before
    public void before() {
        river = new River();
        salmon = new Salmon();
    }

    @Test

    public void addFish() {
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void takeFish() {
        // add fish
        river.addFish((salmon));
        // expect 1 fish
        assertEquals(1, river.fishCount());
        // take fish
        river.takeFish();
        // expect 0 fish
        assertEquals(0, river.fishCount());
    }
}
