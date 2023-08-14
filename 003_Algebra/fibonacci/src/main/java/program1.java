public class program1 {
    public static void main(String[] args) {
        UserFibonacci userFib = new UserFibonacci();
//        for (int i = 1; i <= 1477; i++) {
//            System.out.println("n = "+i + ": " + userFib.TailRecursionFibonacci(i, 0, 1));
//        }
        System.out.println(userFib.TailRecursionFibonacci(40, 0, 1));
    }
}
