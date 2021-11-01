package connection;

public class Connection {
    private static Connection thisConnection;
    private Connection() {

    }

    public static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection = new Connection();
        }
        return thisConnection;
    }
}
