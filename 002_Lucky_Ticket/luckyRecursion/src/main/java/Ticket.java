public class Ticket {
    public long getCount() {
        return count;
    }

    private long count = 0;
    public void returnCount(long N){
        this.count = 0;
        LuckyRecursion(N, 0, 0);
    }
    public void LuckyRecursion(long N, long leftSum, long rightSum){
        if(N == 0) {
            if (leftSum == rightSum){
                this.count++;
            }
            return;
        }
        for (long i = 0; i<=9; i++)
            for (long j = 0; j<=9; j++)
                LuckyRecursion(N - 1, leftSum + i, rightSum + j);
    }
}
