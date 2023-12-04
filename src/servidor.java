import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {
        try {
            //Crear una instancia de la interfaz
            interfaz objetoRemoto = new implementacioninterfaz();

            //Crear y obtener registro RMI en el puerto específico
            Registry registro = LocateRegistry.createRegistry(1234);
            
        }catch (RemoteException e){

            e.printStackTrace();
        }
    }
}
