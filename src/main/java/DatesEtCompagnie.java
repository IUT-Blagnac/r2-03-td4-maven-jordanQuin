
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
import java.util.Scanner ;
public class DatesEtCompagnie {

    /**
     *  @param annee une année
     *  @return vrai si l'année est bissextile, faux sinon
     */
    public static boolean estBissextile(int annee) {

        // A vous
        if (annee % 4 == 0 && annee % 100!= 0 || annee % 400 == 0){ 
            return true;
        }
        else {
            return false ;
        }
    }

    public static int nbJours(int mois, int annee) {
        if (mois == 1 || mois == 3|| mois == 5 || mois == 7|| mois == 8 || mois == 10|| mois == 12){
            return 31 ;
        }
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11 ){
            return 30;
        }
        if (mois == 2 && estBissextile(annee)){
            return 29;
        }
        else {
            return 28;
        }

    }

    public static boolean estValide(int jour, int mois, int annee){
        if ( annee < 1582){

            return false;}
        if (mois > 12 || mois < 1){
            return false;}
        if (jour <= nbJours(mois , annee)){
            return true;} 
        else {
            return false;}

    }
    public static void saisieCalculAffichageValidite() {
    int jour, mois, annee;
        /**************/
    /* E1: Saisie */
    /**************/
    System.out.println("Saisir un jour");
    jour = saisieEntier();
    
    System.out.println("Saisir un mois");
    mois = saisieEntier();
    
    
    System.out.println("Saisir une annee");
    annee = saisieEntier();
    
    if ( estValide( jour,mois,annee)){ 
     System.out.println("La date "+ jour +"/"+ mois + "/"+annee+ " est : VALIDE!" );}
     else{
          System.out.println("La date "+ jour +"/"+ mois + "/"+annee+ " est : FAUX!" );}
         

}

    public static int saisieEntier() {
        Scanner clavier = new Scanner(System.in) ;
        int nombreSaisi = clavier.nextInt() ;
        return nombreSaisi ;
    }
}

