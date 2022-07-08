import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {

        enum Companies {
            SAFARCION, ABSA, CIC, KCB, EQUITY, MICROSOFT, GOOGLE

        }
        EnumMap<Companies, Integer> company_list = new EnumMap<>(Companies.class);

        company_list.put(Companies.SAFARCION, 23);
        company_list.put(Companies.ABSA, 24);
        company_list.put(Companies.CIC, 56);
        company_list.put(Companies.EQUITY, 01);

        System.out.println(company_list);

        EnumMap<Companies, Integer> target_companies = new EnumMap<>(Companies.class);
        target_companies.putAll(company_list);

        System.out.println(target_companies);

        //returns a set of all the values of the enumMap
        System.out.println(target_companies.values());
        //returns a set of all the keys in the enumMap
        System.out.println(target_companies.keySet());
        //returns a set of all the key/value pairs in the enum Map
        System.out.println(target_companies.entrySet());


        //the get method returns the value associated with a certain key
        int company_number = company_list.get(Companies.EQUITY);
        System.out.println(company_number);

        //replace the value of the specifies key in the enumMap
        target_companies.replace(Companies.ABSA, 24, 28);
        System.out.println(target_companies);

        //replaces all values in the enumMap
        target_companies.replaceAll((key, oldValue) -> oldValue + 3);
        System.out.println(target_companies);









    }
}
