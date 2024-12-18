public class Car extends Vehicle {
    
    
    public Car(String name, int kilometers) {  
        super(name, kilometers);  
    }

    @Override  
    public String startEngine() {  
        return "Je suis "
        + this.getBrand()
        + " et je suis en panne :/ ";
    }
}