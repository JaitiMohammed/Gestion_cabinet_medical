import dao.IMetier;
import dao.IMetierImpl;
import entities.clients;
import entities.medecins;

import java.sql.SQLException;
import java.util.List;

public class Start {
    public static void main(String[] args) throws SQLException {
        //Connection instance = ConnectionToDB.getConnection();
        IMetier metier = new IMetierImpl();
        //clients c = new clients("AlI " ,"FATHI" ,"SPPP");
        //medecins m = new medecins("PSYCH" ,"ABDESSALAM" ,"BENJELOUN");
        //medecins m = new medecins("WW" ,"SALMA" ,"RIAHI");
       // metier.addClient(c);
        //metier.addMedecin(m);
       // List<clients> clients = metier.ListClients();
        List<medecins> medecins = metier.ListMedecins();

       /* for(clients c : clients){
            c.afficherClient();
        }*/
        for(medecins med :medecins){
            System.out.println("--- Liste des medecins -----");
            System.out.println(med.getNom());
        }




    }
}
