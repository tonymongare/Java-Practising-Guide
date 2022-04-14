class Factorial {
    
    static int factorial(int number) {
        if (number != 0) {
            return number * factorial(number- 1);
        }
        else {
            return 1;
        }
    } 
    public static void main(String[] args) {
        int result;
        result = factorial(10);
        System.out.println(result);
    }
}
