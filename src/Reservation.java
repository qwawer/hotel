import java.util.Date;

public class Reservation {
    private Date dateArrivee;
    private Date dateDepart;
    private int nbOccupants;
    private Categorie maCategorie;
    private Statut monStatut;
    private Chambre maChambre;

    public Reservation(Date dateArrivee, Date dateDepart, int nbOccupants, Categorie maCategorie) {
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.nbOccupants = nbOccupants;
        this.maCategorie = maCategorie;
        this.monStatut = Statut.EnAttente;
        this.maChambre = null;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getNbOccupants() {
        return nbOccupants;
    }

    public void setNbOccupants(int nbOccupants) {
        this.nbOccupants = nbOccupants;
    }

    public Categorie getMaCategorie() {
        return maCategorie;
    }

    public void setMaCategorie(Categorie maCategorie) {
        this.maCategorie = maCategorie;
    }

    public Statut getMonStatut() {
        return monStatut;
    }

    public void setMonStatut(Statut monStatut) {
        this.monStatut = monStatut;
    }

    public Chambre getMaChambre() {
        return maChambre;
    }

    public void setMaChambre(Chambre maChambre) {
        this.maChambre = maChambre;
    }
}
