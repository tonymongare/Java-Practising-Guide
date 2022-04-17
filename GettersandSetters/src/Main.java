class Vehicle {
    String color = "red";

    //creating the setter method

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();

        obj.setColor("Yellow");
        System.out.println(getColor());
    }
}

//
