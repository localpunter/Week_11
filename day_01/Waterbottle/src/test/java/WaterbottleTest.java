import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterbottleTest {



        Waterbottle waterbottle;

        @Before
        public void before(){
            waterbottle = new Waterbottle(100);
        }

        @Test
        public void getVolume(){
            assertEquals(100, waterbottle.volume());
        }

        @Test
        public void getDrink(){
            assertEquals(90, waterbottle.drink());
        }

        @Test
        public void getEmpty(){
            assertEquals(0, waterbottle.empty());
        }

        @Test
        public void getFull(){
            assertEquals(100, waterbottle.full());
        }
    }

