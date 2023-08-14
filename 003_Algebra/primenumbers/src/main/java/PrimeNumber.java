public class PrimeNumber {
    public long Counter(long n){
        long count = 0;
        for (long i = 2; i <= n; i++) {
                if(isPrime(i))
                    count++;
        }
        return count;
    }

    public long CounterFast(long n){
        long count = 0;
        for (long i = 2; i <= n; i++) {
            if(isPrimeFast(i))
                count++;
        }
        return count;
    }

    public boolean isPrime(long n){
        boolean flag = true;
        for (long i = 2; flag && i < n; i++) {
            if(n%i==0)
                flag = false;
        }
        return flag;
    }
    public boolean isPrimeFast(long n){
        boolean flag = true;
        for (long i = 2, sqrt = (long)Math.sqrt(n); flag && i <= sqrt; i++) {
            if(n%i==0)
                flag = false;
        }
        return flag;
    }
}
