import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {
    NumberList numberList;

    @Before
    public void before() {
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        numberList = new NumberList(testNumbers);
    }

    @Test
    public void numberCount() {
        assertEquals(5, numberList.numberCount());
    }

    @Test
    public void addNumber() {
        numberList.addNumber(12);
        assertEquals(6, numberList.numberCount());
    }

    @Test
    public void getNumber() {
        numberList.addNumber(12);
        assertEquals(12, numberList.getNumberAtIndex(5));
    }

    @Test
    public void sum() {
        numberList.addNumber(1);
        numberList.addNumber(2);
        numberList.addNumber(3);
        numberList.addNumber(4);
        numberList.addNumber(5);
        assertEquals(30, numberList.sum());
    }

}
