import java.time.Duration;
import java.time.Instant;

public class program1 {
    public static void main(String[] args) {
        UserMath userMath = new UserMath();
        long degree = 1_000_000_000;
        double base = 1 + 1/(double)degree;
        Instant start = Instant.now();
        System.out.println(userMath.DegreeFastIteration(base, degree));
        Instant finish = Instant.now();
        long timeResult = Duration.between(start, finish).getSeconds();
        System.out.println("DegreeFastIteration работало "+timeResult + " сек.");

    }
}
