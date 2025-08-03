
package calculatorform;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class CalculatorServer {
    public static void main(String [] args) throws RemoteException{
    Registry b=LocateRegistry.createRegistry(1099);
    b.rebind("Calculator", new CalculatorImplementation());
    System.out.println("Server is Ready For Client.....");
    
    }
    
}
