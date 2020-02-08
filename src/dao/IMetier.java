package dao;

import entities.clients;
import entities.creneaux;
import entities.medecins;
import entities.rv;

import java.sql.SQLException;
import java.util.List;

public interface IMetier {
    //
    public List<clients> ListClients() throws SQLException;
    public List<medecins> ListMedecins() throws SQLException;
    public List<creneaux> ListCreneaux();
    public List<rv> ListRendezVous();
    public clients retrouverClient(int id_client);
    public rv retrouerRv(int id_rv);
    public medecins retrouverMedecins(int id_med);
    public creneaux retrouverCreneaux(int id_cr);
    public void addRendezVous(rv rendezVous);
    public void deleteRendezVous(rv rendezVous);

    public  void addClient(clients c);
    public void deleteClient(int id_client);
    public  void addMedecin(medecins m);
    public void deletMedecin(int id_medecin);


}
