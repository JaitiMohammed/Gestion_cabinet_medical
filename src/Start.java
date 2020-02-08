import dao.ConnectionToDB;

import java.sql.Connection;

public class Start {
    public static void main(String[] args) {
        Connection instance = ConnectionToDB.getConnection();

    }
}
