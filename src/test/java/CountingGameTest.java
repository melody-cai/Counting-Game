import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class CountingGameTest {
    int number1 = 3;
    int number2 = 5;
    @Test
    public void testFizzNumber() {
        int testNumber = 3;
        Assert.assertEquals(CountingGame.checkNum(testNumber, n -> n % number1 == 0, n -> n % number2 == 0), "Fizz");
    }
    @Test
    public void testBuzzNumber() {
        int testNumber = 5;
        Assert.assertEquals(CountingGame.checkNum(testNumber, n -> n % number1 == 0, n -> n % number2 == 0), "Buzz");
    }
    @Test
    public void testFizzBuzzNumber() {
        int testNumber = 15;
        Assert.assertEquals(CountingGame.checkNum(testNumber, n -> n % number1 == 0, n -> n % number2 == 0), "FizzBuzz");
    }
}
