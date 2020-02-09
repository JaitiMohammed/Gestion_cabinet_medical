package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class medecins extends Personne implements Serializable {
    private int id;
    // private int version = 0;
    private String titre;
    private String nom;
    private String prenom;


    public medecins(){}

    public medecins(String titre , String nom , String prenom){
        super(titre,nom,prenom);
    }
    public medecins(medecins medecin){
        super(medecin);
    }

}
