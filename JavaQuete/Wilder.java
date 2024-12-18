
class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle "
        + getFirstname()
        + (this.getAware() ? " et je suis aware" : " et je ne suis pas aware");
    }

}
