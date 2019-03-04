import java.util.function.Predicate;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class CountingGame {
    public static void main(String[] args) {
        int start = 1;
        int end =  100;
        int number1 = 3;
        int number2 = 5;
        for (int i = start; i <= end; i++) {
            System.out.println(checkNum(i, n -> n % number1 == 0, n -> n % number2 == 0));
        }
    }

    public static String checkNum(Integer number, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        if (predicate1.test(number)) {
            if (predicate2.test(number)) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (predicate2.test(number)) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }
}