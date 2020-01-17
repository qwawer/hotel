public enum Categorie {
    Eco("", (float) 24.99),
    Confort("", (float) 49.99),
    ConfortPlus("", (float) 64.99);

    private String description;
    private float prix;

    Categorie(String description, float prix){
        this.description = description;
        this.prix = prix;
    }
}