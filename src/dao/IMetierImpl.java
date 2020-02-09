package dao;

import entities.clients;
import entities.creneaux;
import entities.medecins;
import entities.rv;

import javax.management.Query;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class IMetierImpl implements  IMetier {

    @Override
    public void addClient(clients c) {
        Connection conn = ConnectionToDB.getConnection();
        String query = "INSERT INTO clients (ID,NOM,PRENOM,TITRE) VALUES(null,?,?,?)";
        try {
            PreparedStatement pr = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
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
    public void addMedecin(medecins m) throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        String query = "INSERT INTO medecins (ID,TITRE,NOM,PRENOM) VALUES(null ,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query , PreparedStatement.RETURN_GENERATED_KEYS);
            pr.setString(1,m.getNom());
            pr.setString(2,m.getPrenom());
            pr.setString(3,m.getTitre());

            pr.executeUpdate();
            pr.close();

        System.out.println("Query  successfully added");
    }

    @Override
    public List<clients> getAllClients() {
        Connection conn = ConnectionToDB.getConnection();
        List<clients> clients = new ArrayList<>();
        try {
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
        }catch (Exception e){
            e.printStackTrace();
        }

        return clients;
    }

    @Override
    public List<medecins> getAllMedecins() throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        List<medecins> medecins = new ArrayList<>();

        String query = "SELECT *  FROM medecins";
        PreparedStatement pr = conn.prepareStatement(query);
        ResultSet rs = pr.executeQuery();

        while (rs.next()){
            medecins medecin = new medecins();
            medecin.setId(rs.getInt("ID"));
            medecin.setTitre(rs.getString("TITRE"));
            medecin.setNom(rs.getString("NOM"));
            medecin.setPrenom(rs.getString("PRENOM"));

            medecins.add(medecin);
        }
        pr.close();
        return medecins;
    }

    @Override
    public List<creneaux> getAllCreneaux() throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        List<creneaux> creneaux = new ArrayList<>();

        String query = "SELECT *  FROM creneaux";
        PreparedStatement pr = conn.prepareStatement(query);
        ResultSet rs = pr.executeQuery();

        while (rs.next()){
            creneaux creneau = new creneaux();
            creneau.setId(rs.getInt("ID"));
            creneau.setIdMedecin(rs.getInt("ID_MEDECIN"));
            creneau.setHdebut(rs.getInt("HDEBUT"));
            creneau.setMdebut(rs.getInt("MDEBUT"));
            creneau.setHfin(rs.getInt("HFIN"));
            creneau.setMfin(rs.getInt("MFIN"));

            creneaux.add(creneau);
        }
        pr.close();
        return creneaux;
    }

    @Override
    public List<rv> getRvMedecinJour(int idMedcin, String jour) throws SQLException {
            Connection conn = ConnectionToDB.getConnection();
            List<rv> rendezVous = new ArrayList<>();
            String query ="select r.ID ,r.ID_CLIENT,r.ID_CRENEAU , r.JOUR  from rv r , creneaux c , medecins m\n" +
                         " where r.ID_CRENEAU = c.ID and c.ID_MEDECIN=m.? and r.jour = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1,idMedcin);
            pr.setString(2,jour);
            ResultSet rs = pr.executeQuery();

            while(rs.next()){
                rv RendezVous = new rv();
                RendezVous.setId(rs.getInt("ID"));
                RendezVous.setIdClient(rs.getInt("ID_CLIENT"));
                RendezVous.setIdCreneaux(rs.getInt("ID_CRENEAU"));
                RendezVous.setJour(rs.getDate("JOUR"));
                pr.close();
                rendezVous.add(RendezVous);

            }
            return rendezVous;

    }

    @Override
    public void ajouterRv(String jour, int idCreneaux, int idClient) throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        String query = "INSERT INTO rv (ID,JOUR,ID_CLIENT,ID_CRENEAU) VALUES (null,?,?,?)";
        PreparedStatement pr = conn.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);


        pr.setString(1,jour);
        pr.setInt(2,idClient);
        pr.setInt(3,idCreneaux);
        pr.executeUpdate();
        pr.close();

    }

    @Override
    public void supprimerRv(int idRv) throws SQLException {
        Connection conn = ConnectionToDB.getConnection();
        String query = "DELETE FROM rv WEHRE ID = ?";
        PreparedStatement pr = conn.prepareStatement(query);
        pr.setInt(1,idRv);
        pr.executeUpdate();

        pr.close();
    }

}
