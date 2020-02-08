package classes;

import java.util.Date;

public class rv {
    private int id;
    private Date jour;
    private creneaux creenaux;
    private clients client;

    public rv() {
    }

    public rv(Date jour, creneaux creenaux, clients client) {
        this.jour = jour;
        this.creenaux = creenaux;
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
        return creenaux;
    }

    public void setCreenaux(creneaux creenaux) {
        this.creenaux = creenaux;
    }

    public clients getClient() {
        return client;
    }

    public void setClient(clients client) {
        this.client = client;
    }
}
