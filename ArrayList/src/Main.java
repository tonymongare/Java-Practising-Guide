import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(35);
        numbers.add(11);
        numbers.add(23);

        System.out.print(numbers);

        Integer num = numbers.remove(2);
        System.out.print(num);

    }
}
