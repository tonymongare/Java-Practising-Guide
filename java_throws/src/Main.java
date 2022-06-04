
import java.io.*;

public class Main {
    public static void readFile() throws IOException {

        File newFile = new File("users.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
//
