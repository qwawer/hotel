import java.util.ArrayList;

public class Hotel {
    private int nbReservation = 1;
    private ArrayList<Reservation>mesReservations;
    private ArrayList<Chambre>mesChambres;
    private ArrayList<Client>mesClients;

    public Hotel() {
        this.mesReservations = new ArrayList<>();
        this.mesChambres = new ArrayList<>();
        this.mesClients = new ArrayList<>();
    }

    public int nbReservation(){
            return this.nbReservation ++;
    }

    public ArrayList<Reservation> getMesReservations() {
        return mesReservations;
    }

    public void setMesReservations(ArrayList<Reservation> mesReservations) {
        this.mesReservations = mesReservations;
    }

    public ArrayList<Chambre> getMesChambres() {
        return mesChambres;
    }

    public void setMesChambres(ArrayList<Chambre> mesChambres) {
        this.mesChambres = mesChambres;
    }

    public ArrayList<Client> getMesClients() {
        return mesClients;
    }

    public void setMesClients(ArrayList<Client> mesClients) {
        this.mesClients = mesClients;
    }

    public void modifierStatutReservation(Reservation r, Statut monStatut){
        for (Reservation res: this.mesReservations) {
            if (res.equals(r)){
                res.setMonStatut(monStatut);
                for (Client c : this.mesClients){
                    for (Reservation reservation : c.getMesReservations()){
                        if(reservation.equals(r)){
                            res.setMonStatut(monStatut);
                        }
                    }
                }
            }
        }
    }

    public void modifierCategorieReservation(Reservation r, Categorie maCategorie){
        for (Reservation res: this.mesReservations) {
            if (res.equals(r)){
                res.setMaCategorie(maCategorie);
                for (Client c : this.mesClients){
                    for (Reservation reservation : c.getMesReservations()){
                        if(reservation.equals(r)){
                            res.setMaCategorie(maCategorie);
                        }
                    }
                }
            }
        }
    }
}