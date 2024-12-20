public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {

    }

    @Override
    public int flyUpward(int altitude){
        
    }

    @Override
    public int flyDownward(int altitude) {

    }

    @Override
    public void land() {

    }

}
