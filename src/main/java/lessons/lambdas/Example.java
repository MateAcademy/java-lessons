package lessons.lambdas;

import java.util.function.Function;

public class Example {

    private interface Function<T1, T2, R> {
        R apply(T1 arr, T2 arr2);

    }

    public static void main(String[] args) {

        Function<Integer, Integer, Integer> test = Integer::sum;
        System.out.println(test.apply(5, 5));
    }
}
