import org.junit.Test;
/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class CountingGameTest {
    @Test
    public void testCountingGame() {
        int fizz = 3, buzz = 5, start = 1, end = 100;
        CountingGame.checkNumber(fizz, buzz, start, end);
    }
}
