package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class medecins implements Serializable {
    private int id;
    private int version = 0;
    private String titre;
    private String nom;
    private String prenom;

    private List<rv> ListeRV = new ArrayList<rv>();
    private List<creneaux> ListeCreneaux = new ArrayList<>();



    public medecins() {
    }

    public medecins(String titre,String nom, String prenom) {
        this.nom=nom;
        this.prenom=prenom;
        this.titre = titre;
        version++;

    }

    public List<rv> getListeRV() {
        return ListeRV;
    }

    public void setListeRV(List<rv> listeRV) {
        ListeRV = listeRV;
    }

    public List<creneaux> getListeCreneaux() {

        return ListeCreneaux;
    }

    public void setListeCreneaux(List<creneaux> listeCreneaux) {

        ListeCreneaux = listeCreneaux;
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
}
