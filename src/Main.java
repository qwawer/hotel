public class Main {
    Client cl1 = new Client("Mercelat","Adrien","adrien.mercelat@orange.fr");
    Client cl2 = new Client("Caillat","Ronan","ronan.caillat@gmail.com");
    Client cl3 = new Client("Wawer","Quentin","quentin.wawer@gmail.com");

    Chambre ch1 = new Chambre(100, 4, 25, Categorie.Eco);
    Chambre ch2 = new Chambre(200, 4, 45, Categorie.Confort);
    Chambre ch3 = new Chambre(300, 4, 65, Categorie.ConfortPlus);
}