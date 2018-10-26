package garages;

import java.io.PrintStream;
import java.util.*;

public class Voiture {

    private final String immatriculation;
    private final List<Stationnement> myStationnements = new LinkedList<>();

    public Voiture(String i) {
        if (null == i)
            throw new IllegalArgumentException("immatriculation est null");
        
        immatriculation = i;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * Fait rentrer la voiture au garage
     * Précondition : la voiture ne doit pas être déjà dans un garage
     * @param g le garage où la voiture va stationner
     * @throws java.lang.Exception Si déjà dans un garage
     */
    public void entreAuGarage(Garage g) throws Exception{
        // Et si la voiture est déjà dans un garage ?
        Stationnement s = new Stationnement(this, g);
        myStationnements.add(s);
    }

    /**
     * Fait sortir la voiture du garage
     * Précondition : la voiture doit être dans un garage
     * @throws java.lang.Exception si la voiture n'est pas dans un garage
     */
    public void sortDuGarage() throws Exception {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException();
    }

    /**
     * @return l'ensemble des garages visités par cette voiture
     */
    public Set<Garage> garagesVisites() {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException();
    }

    /**
     * @return vrai si la voiture est dans un garage, faux sinon
     */
    public boolean estDansUnGarage() {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException();
    }
    
    /**
     * Pour chaque garage visité, imprime le nom de ce garage suivi de la liste des dates d'entrée / sortie dans ce garage
     * @param out l'endroit où imprimer (ex: System.out)
     */
    public void imprimeStationnements(PrintStream out) {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException();
    }

}
