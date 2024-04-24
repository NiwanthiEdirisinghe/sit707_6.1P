package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223558537";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Niwanthi";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(7));
    }
    
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWindSpeedWeatherAdvice() {
        WeatherAndMathUtils.weatherAdvice(-10.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrecipitationWeatherAdvice() {
        WeatherAndMathUtils.weatherAdvice(30.0, -5.0);
    }

    @Test
    public void testConcerningWindSpeedWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(45.0, 2.0));
    }

    @Test
    public void testConcerningPrecipitationWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 4.0));
    }

    @Test
    public void testConcerningWindSpeedAndPrecipitationWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.0, 6.0));
    }

    @Test
    public void testDangerousWindSpeedAndPrecipitationWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 6.0));
    }


    @Test
    public void testIsEvenPositiveEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testIsEvenPositiveOdd() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrimePositivePrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
    }

    @Test
    public void testIsPrimePositiveNonPrime() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }

    @Test
    public void testIsPrimePositiveNonPrime2() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(10));
    }
    
    @Test
    public void testIsPrimeOne() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
    }

    @Test
    public void testIsPrimeLargePrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(997));
    }

    @Test
    public void testIsPrimeLargeNonPrime() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(1000));
    }
}
