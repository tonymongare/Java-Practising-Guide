//annotations in java

class Animal {
    public void display() {
        System.out.println("All animals deserve a warm shelter");
    }
}

//creating a subclass
class Dog extends Animal {
    @Override
    public void display() {
        System.out.println("Dogs are mans best friends");
    }
}
//driver class
class Main {
    public static void main(String[] args) {
        //creating object
        Dog obj = new Dog();

        //object returns subclass method instead of the superclass method

        obj.display();
    }
}

//






