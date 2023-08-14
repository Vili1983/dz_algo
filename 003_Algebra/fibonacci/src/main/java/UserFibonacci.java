public class UserFibonacci {
    public double TailRecursionFibonacci(long n, double firstNumber, double secondNumber){
        if(n == 0)
            return firstNumber;
        return TailRecursionFibonacci(n - 1, secondNumber, firstNumber + secondNumber);
    }

    public double InterationFibonacci(long n, double firstNumber, double secondNumber){
        double tempNumber = 0.0;
        for (int i = 0; i < n; i++) {
            tempNumber = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tempNumber + secondNumber;
        }
        return firstNumber;
    }
}
