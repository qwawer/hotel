public class Chambre {
    private int numero;
    private int capacite;
    private float prix;
    private Categorie maCategorie;

    public Chambre(int numero, int capacite, float prix, Categorie maCategorie) {
        this.numero = numero;
        this.capacite = capacite;
        this.prix = prix;
        this.maCategorie = maCategorie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getMaCategorie() {
        return maCategorie;
    }

    public void setMaCategorie(Categorie maCategorie) {
        this.maCategorie = maCategorie;
    }
}
