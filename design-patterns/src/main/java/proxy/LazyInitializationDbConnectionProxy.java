package proxy;


public class LazyInitializationDbConnectionProxy implements Connection{
    private DbConnection dbConnection;

    @Override
    public void connect(String user, String password) {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        dbConnection.connect(user, password);
    }

}
