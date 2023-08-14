import java.time.Duration;
import java.time.Instant;

public class program1 {
    public static void main(String[] args) {
        UserFibonacci userFib = new UserFibonacci();

        Instant start;
        Instant finish;
        double time;
        double tempNumber = 0.0;

        for (int i = 1; i <= 1500; i++) {
            start = Instant.now();
            tempNumber = userFib.TailRecursionFibonacci(i, 0, 1);
            finish = Instant.now();
            time = Duration.between(start, finish).getSeconds();
            System.out.println("rec tail O(N) n = "+i + ": " + tempNumber + " - "+ time + " сек.");
            start = Instant.now();
            tempNumber = userFib.InterationFibonacci(i, 0, 1);
            finish = Instant.now();
            time = Duration.between(start, finish).getSeconds();
            System.out.println("iter O(N)     n = "+i + ": " + tempNumber + " - "+ time + " сек.");
            start = Instant.now();
            tempNumber = userFib.RecursionFibonacci(i);
            finish = Instant.now();
            time = Duration.between(start, finish).getSeconds();
            System.out.println("rec O(2^N)    n = "+i + ": " + tempNumber  + " - "+ time + " сек.");
            System.out.println("-----------------------------------");
        }
    }
}
