package horizon;

import java.util.Date;

public class Livre {
    private String titre;
    private String autheur;
    private boolean disponibilite;
    private Date date_emprunt;
    private Date date_retour;


    public Livre (String titre,String autheur){
        this.titre = titre;
        this.autheur = autheur;
        this.disponibilite = true;
    }
    public boolean emprunter(){
        if(disponibilite){
            disponibilite=false;
            date_emprunt = new Date();
            return true;
        }else
            return  false;
    }
    public boolean retourner(){
        if(disponibilite){
            disponibilite = true;
            date_retour = new Date();
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        if(disponibilite){
            return "Le livre "+ titre + " par " + autheur + " est disponible";
        }else
            return "Le livre "+ titre + " par " + autheur + " est emprunté le " + date_emprunt;
    }
}
