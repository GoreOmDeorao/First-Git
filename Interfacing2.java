interface DatabaseConnection {
    void connect();
    void disconnect();
}

class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
        // Code to establish MySQL connection
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
        // Code to close MySQL connection
    }
}

class OracleConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
        // Code to establish Oracle connection
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
        // Code to close Oracle connection
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection mysqlConnection = new MySqlConnection();
        DatabaseConnection oracleConnection = new OracleConnection();

        mysqlConnection.connect();
        mysqlConnection.disconnect();

        oracleConnection.connect();
        oracleConnection.disconnect();
    }
}
