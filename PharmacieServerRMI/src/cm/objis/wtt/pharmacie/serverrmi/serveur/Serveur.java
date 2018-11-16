package cm.objis.wtt.pharmacie.serverrmi.serveur;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import cm.objis.wtt.pharmacie.serverrmi.servicedistant.impl.ImplServiceDistant;

/**
 * @author WADJI Thierry
 * Serveur RMI
 *
 */
public class Serveur {

	public static void main(String[] args) {
		try {
			//Création de l'objet distant
			ImplServiceDistant serviceDistant = new ImplServiceDistant();
			
			//Création et lancement du registre
			LocateRegistry.createRegistry(1099);
			
			//Publication de la référence de l'objet distant dans l'annuaire
			Naming.bind("svces_distant", serviceDistant);
			
			LocateRegistry.getRegistry();
			//Message indiquant l'état du serveur
			System.err.println("Serveur en marche sur le port: "+ Registry.REGISTRY_PORT);
						
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
