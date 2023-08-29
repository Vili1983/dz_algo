public class program2 {
    public static void main(String[] args) {

        UserQueue<Integer> queue = new UserQueue<>();

        queue.add(1,1);
        queue.add(16,12);
        queue.add(17,2);
        queue.add(1,3);
        queue.add(3,4);
        queue.add(2,5);
        queue.add(1,6);
        queue.add(0,14);
        queue.add(3,7);
        queue.add(1,8);
        queue.add(2,9);
        queue.add(1,10);
        queue.add(17,11);
        queue.add(0,13);


        queue.get();
        System.out.println("*************************");
        queue.get(7);
//        queue.del(9);
//        queue.get();



    }
}
