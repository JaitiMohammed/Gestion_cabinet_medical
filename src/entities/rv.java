package entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class rv implements Serializable {
    private int id;
    private Date jour;
    private int idCreneaux;
    private int idClient;

    public rv() {
    }

    public rv(int id , Date jour, int idCreneaux, int idClient) {
        this.jour = jour;
        this.idClient=idClient;
        this.idCreneaux=idCreneaux;
    }

    // toString
     public String toString() {
         return "[" + id + ","
                 + new SimpleDateFormat("dd/MM/yyyy").format(jour)
                 + "," + idClient + "," + idCreneaux + "]";
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public int getIdCreneaux() {
        return idCreneaux;
    }

    public void setIdCreneaux(int idCreneaux) {
        this.idCreneaux = idCreneaux;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
