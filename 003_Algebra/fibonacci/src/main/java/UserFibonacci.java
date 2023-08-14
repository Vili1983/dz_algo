public class UserFibonacci {
    public double TailRecursionFibonacci(long n, double firstNumber, double secondNumber){
        if(n == 0)
            return firstNumber;
        return TailRecursionFibonacci(n - 1, secondNumber, firstNumber + secondNumber);
    }
}
