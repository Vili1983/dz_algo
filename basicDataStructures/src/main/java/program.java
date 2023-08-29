public class program {
    public static void main(String[] args) {
        SingleArray<Integer> singleArray = new SingleArray<>();
        VectorArray<Integer> vectorArray = new VectorArray<>(10000);
        FactorArray<Integer> factorArray = new FactorArray<>();
        int total = 10000000;
//        testPut(singleArray, total);
//        System.out.println(singleArray.size());
        testPut(vectorArray, total);
        System.out.println(vectorArray.size());
        testPut(factorArray, total);
        System.out.println(factorArray.size());
    }

    private static void testPut(IArray<Integer> userarray, int total){
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++)
            userarray.add(i*2, i);
        System.out.println(userarray + " testPut: " + total + " " + (System.currentTimeMillis() - start));
    }
}
