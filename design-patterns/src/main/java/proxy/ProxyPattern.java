package proxy;

import java.nio.file.AccessDeniedException;
import java.util.Map;

public class ProxyPattern {

    // TODO implement two proxy patterns
    // 1. Proxy with lazy initialization of DbConnection
    // 2. Proxy that rejects and throw AccessDeniedException for
    // all users except "admin" and "stakeholder" while connecting

    public static void main(String[] args) throws AccessDeniedException {

        // Lazy Initialization Proxy
        Connection lazyInitializationDbConnectionProxy = new LazyInitializationDbConnectionProxy();

        System.out.println("Connecting with Lazy Initialization Proxy...");
        lazyInitializationDbConnectionProxy.connect("admin", "adminPassword"); // Connection is created


        // Access Control Proxy
        Connection accessControlDbConnectionProxy = new AccessControlDbConnectionProxy();

        //Access granted
        System.out.println("Connecting with Access Control Proxy...");
        accessControlDbConnectionProxy.connect("admin", "adminPassword"); // Connection allowed

        //Access denied
        try {
            accessControlDbConnectionProxy.connect("guest", "guestPassword"); // Connection attempt not allowed
        } catch (AccessDeniedException e) {
            System.out.println("Access Denied: " + e.getMessage());
        }
    }
}
