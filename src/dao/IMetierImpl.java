package dao;

import entities.clients;
import entities.creneaux;
import entities.medecins;
import entities.rv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IMetierImpl implements  IMetier {

    @Override
    public List<clients> ListClients() throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        List<clients> clients = new ArrayList<>();

        String query = "SELECT *  FROM clients";
        PreparedStatement pr = conn.prepareStatement(query);
        ResultSet rs = pr.executeQuery();

        while (rs.next()){
            clients client = new clients();
            client.setId(rs.getInt("ID"));
            client.setTitre(rs.getString("TITRE"));
            client.setNom(rs.getString("NOM"));
            client.setPrenom(rs.getString("PRENOM"));
            clients.add(client);

        }
        pr.close();
        return clients;
    }

    @Override
    public List<medecins> ListMedecins() throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        List<medecins> medecins = new ArrayList<>();

        String query = "SELECT *  FROM medecins";
        PreparedStatement pr = conn.prepareStatement(query);
        ResultSet rs = pr.executeQuery();

        while (rs.next()){
            medecins medecin = new medecins();
            medecin.setId(rs.getInt("ID"));
            medecin.setNom(rs.getString("NOM"));
            medecin.setPrenom(rs.getString("PRENOM"));
            medecin.setTitre(rs.getString("TITRE"));
            medecins.add(medecin);
        }
        pr.close();
        return medecins;
    }

    @Override
    public List<creneaux> ListCreneaux() {
        return null;
    }

    @Override
    public List<rv> ListRendezVous() {
        return null;
    }

    @Override
    public clients retrouverClient(int id_client) {
        return null;
    }

    @Override
    public rv retrouerRv(int id_rv) {
        return null;
    }

    @Override
    public medecins retrouverMedecins(int id_med) {
        return null;
    }

    @Override
    public creneaux retrouverCreneaux(int id_cr) {
        return null;
    }

    @Override
    public void addRendezVous(rv rendezVous) {

    }

    @Override
    public void deleteRendezVous(rv rendezVous) {

    }

    @Override
    public void addClient(clients c) {
        Connection conn = ConnectionToDB.getConnection();
        String query = "INSERT INTO clients (NOM,PRENOM,TITRE) VALUES(?,?,?)";
        try {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1,c.getNom());
            pr.setString(2,c.getPrenom());
            pr.setString(3,c.getTitre());

            pr.executeUpdate();
            pr.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Query  successfully added");
    }

    @Override
    public void deleteClient(int id_client) {

    }

    @Override
    public void addMedecin(medecins m) {
        Connection conn = ConnectionToDB.getConnection();
        String query = "INSERT INTO medecins (VERSION,TITRE,NOM,PRENOM) VALUES(?,?,?,?)";
        try {
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1,m.getVersion());
            pr.setString(3,m.getNom());
            pr.setString(4,m.getPrenom());
            pr.setString(2,m.getTitre());

            pr.executeUpdate();
            pr.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Query  successfully added");
    }

    @Override
    public void deletMedecin(int id_medecin) {

    }
}
