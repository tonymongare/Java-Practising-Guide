import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            //number of bytes available in the input stream
            System.out.println("Number of bytes available" +input.available() );
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
