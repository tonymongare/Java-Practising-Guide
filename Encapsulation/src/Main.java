
class Music {
    public void genre() {
        System.out.println("Listening to Music...");
    }
}

class Pop extends Music {
    public void genre() {
        System.out.println("Listening to PoP Music...");
    }
}
class Rnb extends Music {
    public void genre() {
        System.out.println("Listening to Rnb Music...");
    }
}
class Reggea extends Music {
    public void genre() {
        System.out.println("Listening to Reggea Music..");
    }

}
class Main {

    public static void main(String[] args) {
        Pop popobj = new Pop();
        Rnb Rbobj = new Rnb();
        Reggea Reggobj = new Reggea();

        popobj.genre();
        Rbobj.genre();
        Reggobj.genre();
    }
}
//e


