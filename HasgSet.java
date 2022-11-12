import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        
        Set<Integer> numbers1 = new HashSet<>();
        
        numbers1.add(12);
        numbers1.add(13);
        numbers1.add(14);
        
        System.out.println(numbers1);
        
        
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(15);
        numbers2.add(16);
        numbers2.add(17);
        
        //The union of the two sets
        numbers1.addAll(numbers2);
        System.out.println(numbers1);
        
           
        
    }
}


//
