public class program {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 1; i <=10 ; i++) {
            ticket.returnCount(i);
            System.out.println(ticket.getCount());
        }

    }
}
