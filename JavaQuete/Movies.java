

class Movies {


    public static void main(String[] args) {
        String[] movies = {"Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et le Cadran de la Destinée", "Indiana Jones et la Dernière Croisade"};
        String [] actorsMovie1 = {"HF","SL","KA"};
        String [] actorsMovie2 = {"HF","PWB","MM"};
        String [] actorsMovie3 = {"HF","SC","DE"};
        String[][] actors = new String[][] {
            actorsMovie1,
            actorsMovie2,
            actorsMovie3
        };
        for (int idx = 0; idx < movies.length; idx++) {   
            System.out.println("Dans le film " + movies[idx] + ", les principaux acteurs sont : " + actors[idx][0] + ", " + actors[idx][1] + ", " + actors[idx][2]);
            
        }
    }
}