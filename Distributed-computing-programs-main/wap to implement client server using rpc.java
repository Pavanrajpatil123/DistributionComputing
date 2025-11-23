//hello.java

import java.rmi.*;
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

//helloimp.java
import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject implements Hello {
  protected HelloImpl() throws RemoteException {
        super();
    }
  public String sayHello() throws RemoteException {
        return "Hello from RMI Server!";
    }
}

//Server.java
import java.rmi.*;
public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();

            // bind object to RMI registry
            Naming.rebind("rmi://localhost/HelloServer", obj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}



//client.java

import java.rmi.*;
public class Client {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}

combine all files in one folder
on windows - start rmiregistry
linux - registry &

java server
java client
