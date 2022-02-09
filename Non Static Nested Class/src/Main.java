
// Online IDE - Code Editor, Compiler, Interpreter

class Car {
    String carName;
    String carType;
    //using a constructor to instatiate
    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    //creating a protected method
    protected String getCarName() {
        return this.carName;
    }

    //nested class
    class Engine {
        String engineType;

        void setEngine() {
            if (Car.this.carType.equals("Toyota")) {

                if(Car.this.getCarName().equals("BMW")) {
                    this.engineType = "Bigger";
                } else {
                    this.engineType = "Smaller";
                }
            } else {
                this.engineType = "Bigger";
            }

        }
        String getEngineType() {
            return this.engineType;
        }
    }
}

//creating the driver class
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Crystler", "BMW");

        Car.Engine car2 = car.new Engine();
        car2.setEngine();
        System.out.println("The Engine Type is:" +car2.getEngineType());

        Car car3 = new Car("Mazda", "Tesla");
        Car.Engine car4 = car3.new Engine();
        car4.setEngine();
        System.out.println("The Engine Type is:" +car4.getEngineType());

    }

}
    
//end
