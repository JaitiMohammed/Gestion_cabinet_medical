import dao.IMetier;
import dao.IMetierImpl;
import entities.Personne;
import entities.clients;
import entities.creneaux;
import entities.medecins;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws SQLException {

        //Connection instance = ConnectionToDB.getConnection();
        IMetier metier = new IMetierImpl();
        /*
        clients c = new clients("ALI","SAMADI","Mr");
        metier.addClient(c);
        medecins m = new medecins("Mr" ,"LOTFI" ,"BRAHIMI");
        metier.addMedecin(m);
        */

        clients cc = new clients("SAID ","DARI","Mr");

        metier.addClient(cc);
        List<clients> c = metier.getAllClients();
        List<medecins> m = metier.getAllMedecins();
        for (clients cl : c){
            System.out.println(cl.getNom());
        }
        for(medecins md : m){
            System.out.println(md.getNom());
        }

    }
}
