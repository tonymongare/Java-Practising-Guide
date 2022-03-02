public class Main {
    public static void divideByZero() {

        throw new ArithmeticException("This is division by zero");
    }
    
    public static void main(String[] args) {
        divideByZero();

        
    }
}
//end
