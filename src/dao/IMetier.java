package dao;

import classes.clients;
import classes.medecins;
import classes.rv;

import java.util.List;

public interface IMetier {
    //
    public void addClient(clients c);
    public List<clients> listClients();
    public void deleteClient(clients c);

    public void addRv(rv r);
    public  void deleteRv(rv r);
    public  List<rv> listRv();

    public void addMedecin(medecins m);
    public  void deleteMedecin(medecins m);
    public  List<medecins> listmedecin();

}
