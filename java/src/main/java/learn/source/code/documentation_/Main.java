package learn.source.code.documentation_;

import learn.source.code.documentation_.math.Math;

/**
 * {@docRoot}
 */
public class Main {
    public static void main(String[] args) {
        var math = new Math();
        System.out.println(math.fibonacci(10));
        System.out.println(math.square(10));
    }
}
