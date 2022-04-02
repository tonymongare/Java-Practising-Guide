import java.util.LinkedList;
import java.util.Queue;
class Main {
    public static void main(String[] args) {
        
        Queue<Integer> numbers = new LinkedList<>();
        
        numbers.offer(22);
        numbers.offer(23);
        numbers.offer(24);
        numbers.offer(25);
        
        System.out.println(numbers);
        
        int first_number = numbers.peek();
        
        System.out.println(first_number);
        
        int remove_head = numbers.poll();
        
        System.out.println(remove_head);
        
        
    }
}
//
