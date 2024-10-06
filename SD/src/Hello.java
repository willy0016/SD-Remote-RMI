import java.rmi.*;
 
public interface Hello extends Remote {
   public String hello(int a, int b, int c) throws RemoteException;
}