public class program2 {
    public static void main(String[] args) {
        String path = "Y:\\Обучение\\Otus\\A01_Счастливые_билеты-1801-057a77\\1.Tickets\\";
        Ticket ticket = new Ticket();
        Test test = new Test();
        try{
            for (int i = 0; i <=9; i++) {
                test.Test(path+"test."+i+".in",path+"test."+i+".out", ticket);
            }

        }
        catch(Exception e){
            e.getMessage();
        }
    }
}
