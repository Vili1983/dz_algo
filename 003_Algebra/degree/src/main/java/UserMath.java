public class UserMath {
    public double DegreeFastIteration(double baseOfDegree, long degree){
        if(degree == 0) return 1;
        if(degree == 1) return baseOfDegree;
        double result = 1.0;
        while(degree > 0){
            if (degree%2 == 1)
                result*=baseOfDegree;
            baseOfDegree*=baseOfDegree;
            degree/=2;
        }
        return result;
    }
}
