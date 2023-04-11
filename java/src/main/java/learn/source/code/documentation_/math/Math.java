package learn.source.code.documentation_.math;

// std
import java.util.ArrayList;

/**
 * This class contains various methods to solve some mathematical problems.
 * 
 * <pre>{@code
 *      var mathObj = new Math();
 *      long fibonacci10 = math.fibonacci(10);
 *      assertEquals(55L, fibonacci10);
 * }</pre>
 */
public class Math {

    /**
     * Constructor with no arguments.
     */
    public Math() {}

    /**
     * Returns the fibonacci number of num.
     * 
     * @param num number to calculate the fibonacci number.
     * @return The fibonacci number of num.
     */
    public long fibonacci(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;

        ArrayList<Long> fibonacci = new ArrayList<Long>();
        fibonacci.add(0L);
        fibonacci.add(1L);

        for (int i = 2; i <= num; i++) {
            try {
                long sum = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(sum);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return fibonacci.get(fibonacci.size() - 1);
    }

    /**
     * Returns the square number of num.
     * 
     * @param num number to calculate the square number.
     * @return The square number of num.
     */
    public long square(int num) {
        return num * num;
    }
}
