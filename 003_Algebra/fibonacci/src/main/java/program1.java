public class program1 {
    public static void main(String[] args) {
        UserFibonacci userFib = new UserFibonacci();
//        for (int i = 1; i <= 1477; i++) {
//            System.out.println("n = "+i + ": " + userFib.TailRecursionFibonacci(i, 0, 1));
//        }
//        System.out.println(userFib.TailRecursionFibonacci(40, 0, 1));
        for (int i = 1; i <= 1500; i++) {
            System.out.println("tail n = "+i + ": " + userFib.TailRecursionFibonacci(i, 0, 1));
            System.out.println("     n = "+i + ": " + userFib.InterationFibonacci(i, 0, 1));
        }
//        System.out.println(userFib.InterationFibonacci(34, 0, 1));
    }
}
