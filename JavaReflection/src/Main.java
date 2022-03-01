import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try {
            Bird obj = new Bird();

            Class obj2 = obj.getClass();

            //get class name
            String name = obj2.getName();
            System.out.println("Name of the class" +name);

            //get the modifier
            int modifier = obj2.getModifiers();

            //converting the modifier to string form
            String mod1 = Modifier.toString(modifier);
            System.out.println("The modifier" +mod1);

            Class superClass = obj2.getSuperclass();
            System.out.println("The super class is" +superClass.getName());



        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
