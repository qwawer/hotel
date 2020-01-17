import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String nom;
    private String prenom;
    private String email;
    private ArrayList<Reservation> mesReservations;

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mesReservations = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Reservation> getMesReservations() {
        return mesReservations;
    }

    public void setMesReservations(ArrayList<Reservation> mesReservations) {
        this.mesReservations = mesReservations;
    }

    public void reserver(Date DateArr, Date DateDep, int nbPersonne, Categorie maCategorie){
        Reservation res = new Reservation(DateArr,DateDep, nbPersonne, maCategorie);
        mesReservations.add(res);

    }

    public void annulerReservation(Reservation maReservation){
        maReservation.setMonStatut(Statut.Annulee);
    }
}
