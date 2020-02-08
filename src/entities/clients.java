package entities;

import java.io.Serializable;

public class clients implements Serializable {
    
    private  int id ;
    private  int version; // useless
    private  String titre;
    private  String nom;
    private  String prenom;
    
    public clients() {
    }

    public clients(String nom, String prenom, String titre) {
        this.nom=nom;
        this.prenom=prenom;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public void afficherClient(){
        System.out.println("ID :" + getId());
        System.out.println("TITRE :" + getTitre());
        System.out.println("NOM :" + getNom());
        System.out.println("PRENOM :" + getPrenom());

    }
}
