import java.util.Date;

public class Reservation {
    private int numero;
    private Date dateArrivee;
    private Date dateDepart;
    private int nbOccupants;
    private Statut monStatut;
    private Chambre maChambre;

    public Reservation(int numero, Date dateArrivee, Date dateDepart, int nbOccupants, Statut monStatut, Chambre maChambre) {
        this.numero = numero;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.nbOccupants = nbOccupants;
        this.monStatut = monStatut;
        this.maChambre = maChambre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
