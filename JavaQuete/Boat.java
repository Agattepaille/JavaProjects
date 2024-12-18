public class Boat extends Vehicle {
    
    
    public Boat(String name, int kilometers) {  
        super(name, kilometers);  
    }

    @Override  
    public String startEngine() {  
        return "Je suis "
        + this.getBrand()
        + " et je fais glou ! ";
    }
}