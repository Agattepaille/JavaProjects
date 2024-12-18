public class Hangar {


    public static void main(String[] args) {
        Car clio = new Car("Clio", 100000);
        Boat titanic = new Boat("Titanic", 100);
        System.out.println(clio.startEngine());
        System.out.println(titanic.startEngine());
    }
}