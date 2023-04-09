package learn.source.code.documentation.math;

// std
import java.util.ArrayList;


public class Math {

    public Math() {}

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

    public long square(int num) {
        return num * num;
    }
}
