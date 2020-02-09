package entities;

import java.io.Serializable;

public class creneaux implements Serializable {
    private  int id ;
    private int hdebut;
    private int mdebut;
    private int hfin;
    private int mfin;
    private int idMedecin ;
    //private medecins medecin; //
   // private clients client; //



    public creneaux() {
    }

    public creneaux(int idMedecin , int hdebut, int mdebut, int hfin, int mfin) {
        this.hdebut = hdebut;
        this.mdebut = mdebut;
        this.hfin = hfin;
        this.mfin = mfin;
        this.idMedecin=idMedecin;
    }

    public String toString() {
        return "[" + id + "," + idMedecin + "," + hdebut + ":" + mdebut + ","
                + hfin + ":" + mfin + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHdebut() {
        return hdebut;
    }

    public void setHdebut(int hdebut) {
        this.hdebut = hdebut;
    }

    public int getMdebut() {
        return mdebut;
    }

    public void setMdebut(int mdebut) {
        this.mdebut = mdebut;
    }

    public int getHfin() {
        return hfin;
    }

    public void setHfin(int hfin) {
        this.hfin = hfin;
    }

    public int getMfin() {
        return mfin;
    }

    public void setMfin(int mfin) {
        this.mfin = mfin;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(int idMedecin) {
        this.idMedecin = idMedecin;
    }
}
