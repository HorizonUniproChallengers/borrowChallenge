package horizon;

public class Principale {
    public static void main(String[] args) {
        Livre livres = new Livre("Aventure ambigu","Berthonge");
        Livre livres1 = new Livre("Limitless","Tongo");
        System.out.println("Bienvenue dans la gestion de livre \n");

        System.out.println(livres);
        System.out.println(livres1);

        livres.emprunter();
        System.out.println(livres);




    }
}
