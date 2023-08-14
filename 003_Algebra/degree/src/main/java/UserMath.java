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

    public double DegreeIteration(double baseOfDegree, long degree){
        double result = 1.0;
        for (int i = 0; i < degree; i++) {
            result*=baseOfDegree;
        }
        return result;
    }
}
