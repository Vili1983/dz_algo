import java.time.Duration;
import java.time.Instant;

public class program1 {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        Instant start;
        Instant finish;
        double time;
        long tempNumber = 0;

        for (int i = 10; i < 1_000_000_000; i*=10) {
            start = Instant.now();
            tempNumber = primeNumber.Counter(i);
            finish = Instant.now();
            time = Duration.between(start, finish).getSeconds();
            System.out.println(i + " --> " +tempNumber+ "  " + time + " ");
        }


    }
}
