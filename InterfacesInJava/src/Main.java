//implementation of interfaces in java

interface Polygon {
    void area(int length, int width);
}

class Rectangle implements Polygon {
    public void area(int length, int width) {
        System.out.println("Thea area of the Rectangle is:" +(length * width));
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();

        obj.area(50, 40);
    }

}

//e
