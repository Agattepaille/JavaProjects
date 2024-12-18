public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //  Getters and setters
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getKilometers() {
        return this.kilometers;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // Methods
    public abstract String startEngine();
}