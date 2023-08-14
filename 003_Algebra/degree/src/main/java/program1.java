import java.time.Duration;
import java.time.Instant;

public class program1 {
    public static void main(String[] args) {
        UserMath userMath = new UserMath();
        long degree = 2_147_483_647;
        double base = 1 + 1/(double)degree;

        Instant start = Instant.now();
        System.out.println(userMath.DegreeFastIteration(base, degree));
        Instant finish = Instant.now();
        long timeResult = Duration.between(start, finish).getSeconds();
        System.out.println("DegreeFastIteration работало "+timeResult + " сек.");

        start = Instant.now();
        System.out.println(userMath.DegreeIteration(base, degree));
        finish = Instant.now();
        timeResult = Duration.between(start, finish).getSeconds();
        System.out.println("DegreeIteration работало "+timeResult + " сек.");

        start = Instant.now();
        System.out.println(userMath.DegreeRecursion(base, degree));
        finish = Instant.now();
        timeResult = Duration.between(start, finish).getSeconds();
        System.out.println("DegreeRecursion работало "+timeResult + " сек.");

    }
}
