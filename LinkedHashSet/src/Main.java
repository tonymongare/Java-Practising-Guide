import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("JP Morgan");
        names.add("Two sigma");
        names.add("Chase Bank");
        names.add("Citadel");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }

    }
}
