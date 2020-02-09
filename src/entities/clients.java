package entities;

import java.io.Serializable;

public class clients extends Personne implements Serializable {
    
    private  int id ;
    private  int version; // useless
    private  String titre;
    private  String nom;
    private  String prenom;
    
    public clients() {
    }

    public clients(String nom , String prenom ,String titre){
        super(titre,nom,prenom);
    }

   public clients (clients client){
        super(client);
   }
}
