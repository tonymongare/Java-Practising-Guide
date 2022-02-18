public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always executed after the try and catch block ");
            //code that might have been skippes by return or break  or continue

        }
    }
}
//end
