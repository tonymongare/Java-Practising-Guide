//recursion
class Factorial {

    public static int factorial(int n) {

        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }

        }

        public static void main(String[] args) {
            int number = 6;
            int result;
            result = factorial(number);
            System.out.println("The factorial of the number is: " + result);
        }
    }

