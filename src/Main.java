import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main() throws ParseException {
        Client cl1 = new Client("Mercelat","Adrien","adrien.mercelat@orange.fr");
        Client cl2 = new Client("Caillat","Ronan","ronan.caillat@gmail.com");
        Client cl3 = new Client("Wawer","Quentin","quentin.wawer@gmail.com");

        Chambre ch1 = new Chambre(100, 4, 25, Categorie.Eco);
        Chambre ch2 = new Chambre(200, 4, 45, Categorie.Confort);
        Chambre ch3 = new Chambre(300, 4, 65, Categorie.ConfortPlus);

        cl1.reserver(new SimpleDateFormat("dd/MM/yyyy").parse("17/01/2020"),
                new SimpleDateFormat("dd/MM/yyyy").parse("27/01/2020"),
                3, Categorie.Confort);

        cl2.reserver(new SimpleDateFormat("dd/MM/yyyy").parse("20/01/2020"),
                new SimpleDateFormat("dd/MM/yyyy").parse("27/01/2020"),
                3, Categorie.Confort);

        cl3.reserver(new SimpleDateFormat("dd/MM/yyyy").parse("22/01/2020"),
                new SimpleDateFormat("dd/MM/yyyy").parse("30/01/2020"),
                3, Categorie.Confort);
    }
}