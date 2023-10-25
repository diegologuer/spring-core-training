package proxy;

import java.nio.file.AccessDeniedException;

public class AccessControlDbConnectionProxy implements Connection {
    private DbConnection dbConnection;

    public void connect(String user, String password) throws AccessDeniedException {
        if ("admin".equals(user) || "stakeholder".equals(user)) {
            if (dbConnection == null) {
                dbConnection = new DbConnection();
            }
            dbConnection.connect(user, password);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user);
        }
    }

}
