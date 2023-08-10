import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Test {
    public void Test(String path, String file1, String file2, Ticket ticket) throws IOException {
        FileReader inFile = new FileReader(path+file1);
        FileReader outFile = new FileReader(path+file2);
        BufferedReader inFileBr = new BufferedReader(inFile);
        BufferedReader outFileBr = new BufferedReader(outFile);

        Instant start = Instant.now();

        ticket.returnCount(Integer.parseInt(inFileBr.readLine()));
        Instant finish = Instant.now();
        long eee = Duration.between(start, finish).toSeconds();

        if(ticket.getCount() == Integer.parseInt(outFileBr.readLine())){

            System.out.println("Проверка файлов: " +file1+" ### "+ file2+": "+ticket.getCount() + ": true - Длительность выполнения: " + eee + " сек.");
        }else
            System.out.println(ticket.getCount() + ": false - Длительность выполнения: " + eee + " сек.");

    }
}
