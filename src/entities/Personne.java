package entities;

public class Personne {
    private int id;
    private String titre;
    private String nom;
    private String prenom;

    public Personne(){

    }
    public Personne( String titre, String nom, String prenom) {
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(Personne personne){

    }
    public String toString(){
        return "[ " + id  + " , " + titre + "," + nom + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
