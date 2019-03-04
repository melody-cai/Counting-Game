/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class CountingGame {
    public static void main(String[] args) {
        int fizz = 3, buzz = 5, start = 1, end = 100;
        checkNumber(fizz, buzz, start, end);
    }
    public static void checkNumber(int fizz, int buzz, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % fizz == 0) {
                if (i % buzz == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
