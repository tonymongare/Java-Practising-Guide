//we cannot not access members of a non static class from a static class
class Fruits {
    String fruitType;
    String typeOfFruit(String fruitType) {
        return this.fruitType;
    }

    static class Oranges {
        int localoranges = 50;
        int importedoranges = 44;
        int getTotalOranges() {
            if(Fruits.this.fruitType.equals("Oranges")) {
                return localoranges + importedoranges;
            } else {
                return 0;
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Fruits name = new Fruits();

        Fruits.Oranges numb = name.new Oranges();
        System.out.println("The Number of Oranges in the House is" +num.getTotalOranges());
    }
}