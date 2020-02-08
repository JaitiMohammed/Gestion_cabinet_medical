package entities;

import java.io.Serializable;
import java.util.Date;

public class rv implements Serializable {
    private int id;
    private Date jour;
    private creneaux creneaux;
    private clients client;

    public rv() {
    }

    public rv(Date jour, creneaux creneaux, clients client) {
        this.jour = jour;
        this.creneaux = creneaux;
        this.client = client;
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

    public creneaux getCreenaux() {
        return creneaux;
    }

    public void setCreneaux(creneaux creneaux) {
        this.creneaux = creneaux;
    }

    public clients getClient() {
        return client;
    }

    public void setClient(clients client) {
        this.client = client;
    }
}
