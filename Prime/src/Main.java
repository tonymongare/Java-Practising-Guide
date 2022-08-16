class Main {
    public static void main(String[] args) {

        int number = 11;
        boolean label = false;

        for(int i = 2; i <= number/2; i++) {
            //checking for prime number
            if(number % 2 == 0) {

                label = true;
                break;
            }
        }
        if(!label) {
            System.out.println("This is a prime Number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
//
