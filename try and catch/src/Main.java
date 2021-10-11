//java try and catch block

public class Main {
    public static void main(String[] args) {
        //a try block must be followed by a catch block
        try {
            int dividebyzero = 6/ 0;
            System.out.println("Dividing by zero exception");
        } catch (ArithmeticException e) {
            System.out.println("This an arithmethic exception" + e.getMessage());

        }
    }
}


