interface Polygon {
    void area();

    default void sides() {
        System.out.println("We can get the number of sides of the Polygon");
    }
}

class Rectangle implements Polygon {
    public void area() {
        int length = 40;
        int width = 30;
        int area = length * width;
        System.out.println("The area of the rectangle is:" + area);
    }

    @Override
    public void sides() {
        System.out.println("A rectangle has Four sides");

    }
}

class Square implements Polygon {
    public void area() {
        int length = 89;
        int area = length * length;
        System.out.println("The area of the Square:" +area);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Square obj2 = new Square();
        obj.area();
        obj.sides();
        obj2.area();

        }
    }
//e

