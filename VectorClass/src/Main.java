import java.util.Iterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<String> companies = new Vector<>();

        companies.add("Google");
        companies.add("InfoSys");
        companies.add("Stanbic");
        companies.add("Netflix");

        String target_company = companies.get(2);

        System.out.print(target_company);
/*
        //returns an object that we can use to sequentially access vector elements.
        Iterator<String> all_companies = companies.iterator();

        while(all_companies.hasNext()) {
            System.out.print(all_companies.next());
            System.out.print(", ");
        }

 */

        for (String company : companies) {
            System.out.print(company);
            System.out.print(", ");

        }

        }
    
    
    }
//end
