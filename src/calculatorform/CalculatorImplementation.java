
package calculatorform;

import java.rmi.server.*;
import java.rmi.*;
public class CalculatorImplementation extends UnicastRemoteObject implements CalCulatorInterface{
private double result;
public CalculatorImplementation() throws RemoteException{
}
    @Override
    public double add(double x, double y) throws RemoteException {
        result=x+y;
        return result;
    }

    @Override
    public double sub(double x, double y) throws RemoteException {
       result=x-y;
        return result;
    }

    @Override
    public double mul(double x, double y) throws RemoteException {
         result=x*y;
        return result;
    }
    

    @Override
    public double div(double x, double y) throws RemoteException {
         result=x/y;
        return result;
    }
    @Override
    public double mol(double x, double y) throws RemoteException{
        result=x%y/100;
        return result;
    }
    @Override
    public double display(double result) throws RemoteException{
     return result;   
    }
}
