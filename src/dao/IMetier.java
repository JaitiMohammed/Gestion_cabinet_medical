package dao;

import entities.clients;
import entities.creneaux;
import entities.medecins;
import entities.rv;

import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

public interface IMetier {

    public List<clients> getAllClients();
    public List<medecins> getAllMedecins() throws SQLException;
    public List<creneaux> getAllCreneaux() throws SQLException;
    public List<rv> getRvMedecinJour(int idMedcin ,String jour ) throws SQLException;
    public void ajouterRv(String jour , int idCreneaux , int idClient) throws SQLException;
    public void supprimerRv(int idRv) throws SQLException;
    public void addClient(clients c);
    public void addMedecin(medecins m) throws SQLException;

}
