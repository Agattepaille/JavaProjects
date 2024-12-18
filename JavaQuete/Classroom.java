class Classroom {


    public static void main(String[] args) {
        Wilder jean = new Wilder("Jean", true);
        Wilder jeanne = new Wilder("Jeanne", false);
        System.out.println(jean.whoAmI());
        System.out.println(jeanne.whoAmI());
    }
}