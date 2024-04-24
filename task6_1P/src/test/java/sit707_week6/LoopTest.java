package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopTest {

    @Test
    public void testSumOfNumbers() {
        Assert.assertEquals(15, Loop.sumOfNumbers(5));
    }

    @Test
    public void testCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(3, Loop.countEvenNumbers(numbers));
    }
}