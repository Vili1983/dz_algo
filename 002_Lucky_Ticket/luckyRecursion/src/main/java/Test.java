import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public void Test(String file1, String file2, Ticket ticket) throws IOException {
        FileReader inFile = new FileReader(file1);
        FileReader outFile = new FileReader(file2);
        BufferedReader inFileBr = new BufferedReader(inFile);
        BufferedReader outFileBr = new BufferedReader(outFile);

        ticket.returnCount(Integer.parseInt(inFileBr.readLine()));
        if(ticket.getCount() == Integer.parseInt(outFileBr.readLine())){
            System.out.println(ticket.getCount() + ": true");
        }else
            System.out.println(ticket.getCount() + ": false");

    }
}
