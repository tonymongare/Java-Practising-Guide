import java.util.EnumSet;

public class Main {
    enum Companies { TESLA, META, SPACEX, CITADEL, GOOGLE, SNAPCHAT};


    public static void main(String[] args) {
        //creating an enum set using the allOf() method
        EnumSet<Companies> dream_work_places = EnumSet.allOf(Companies.class);

        System.out.println(dream_work_places);

        //creating an empty set
        EnumSet<Companies> targets = EnumSet.noneOf(Companies.class);
        System.out.println(targets);

        //creating an enumset from a range of values
        EnumSet<Companies> shortlist = EnumSet.range(Companies.TESLA, Companies.GOOGLE);
        System.out.println(shortlist);

        //creating an enumset with specified values.
        EnumSet<Companies> top_list = EnumSet.of(Companies.TESLA, Companies.CITADEL, Companies.GOOGLE);
        System.out.println(top_list);

    }
}
