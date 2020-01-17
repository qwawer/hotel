import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation>mesReservations;
    private ArrayList<Chambre>mesChambres;
    private ArrayList<Client>mesClients;

    public Hotel() {
        this.mesReservations = new ArrayList<>();
        this.mesChambres = new ArrayList<>();
        this.mesClients = new ArrayList<>();
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
}