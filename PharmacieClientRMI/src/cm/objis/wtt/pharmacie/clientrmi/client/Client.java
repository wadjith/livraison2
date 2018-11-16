package cm.objis.wtt.pharmacie.clientrmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import cm.objis.wtt.pharmacie.serverrmi.servicedistant.IServiceDistant;

/**
 * @author WADJI Thierry
 * @version 1.0
 *
 */
public class Client {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		String ipServeur=null;
		String portServeur = null;
		char rep = 'q';
		
		System.out.println("########################################################################");
		System.out.println("BIENVENUE DANS NOTRE APPLICATION DE GESTION DES PRODUITS PHARMACEUTIQUES");
		System.out.println("########################################################################");
	
		try {
			System.out.print("Entrez l'adresse IP du serveur: ");
			ipServeur = sc.nextLine();
			System.out.print("Entrez le num�ro de port du serveur: ");
			portServeur = sc.nextLine(); 
			System.out.println("");
			System.out.println("");  
			
			//R�cup�ration de l'objet distant � partir de son interface et de son identifiant = "svces_distant"
			IServiceDistant stub = (IServiceDistant) Naming.lookup("rmi://"+ipServeur+":"+portServeur+"/svces_distant");
			System.out.println(stub.welcome());
			
			System.out.println("Les op�rations disponibles sont les suivantes:");
			System.out.println("e: Enregistrer un produit");
			System.out.println("r: Rechecher un produit par mot cl�");
			System.out.println("l: Lister tous les produits");
			System.out.println("q: Quitter l'application");
			do{
				System.out.println("Choisir l'op�ration que vous voulez effectuer.");
				System.out.print("e= Enregistrer - r= Recherccher - l= Lister - q= Quitter :");
				rep = sc.nextLine().charAt(0);
				switch(rep){
				case 'e':
					enregistreProduit(stub);
					break;
				case 'r':
					rechercheProduit(stub);
					break;
				case 'l':
					listeProduit(stub);
					break;
				case 'q':
					sc.close();
					System.out.println("Aurevoir");
					break;
				default :
					System.out.println("l'op�ration choisie n'existe pas");		
				}
				
				
			}while(rep != 'q');

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
	}
	
	/**
	 * 
	 * Proc�dure d'enregistrement d'un produit
	 * @param isd : est une instance de l'interface de service distant
	 * @throws RemoteException 
	 */
	private static void enregistreProduit(IServiceDistant isd) throws RemoteException{
		System.out.println("################################");
		System.out.println("  ENREGISTREMENT DE PRODUIT  ");
		System.out.println("################################");
		
		// Je r�cup�re les propri�t�s du Produit
		System.out.print("R�ference: ");
		String ref = sc.nextLine();
		System.out.print("Libelle: ");
		String libelle = sc.nextLine();
		System.out.print("Prix: ");
		double prix = Double.parseDouble(sc.nextLine());
		System.out.print("Quantit�: ");
		int qte = Integer.parseInt(sc.nextLine());
		
		// j'enregistre le nouveau produit
		String p = isd.enregistreProduit(ref, libelle, prix, qte);
		System.out.println("Le produit enregistr� est le suivant");
		System.out.println(p);
		System.out.println("########## FIN ENREGISTREMENT ########");
		System.out.println();
		
	}
	/**
	 * 
	 * Proc�dure de recherche d'un produit par mot cl�
	 * @param isd : est une instance de l'interface de service distant
	 * @throws RemoteException
	 * 
	 */
	private static void rechercheProduit(IServiceDistant isd) throws RemoteException{
		System.out.println("################################");
		System.out.println("   RECHERCHE DE PRODUIT   ");
		System.out.println("################################");
		System.out.print("Entrer le mot cl�: ");
		String motcle = sc.nextLine();
		
		//Je rechercche les produits correspondants
		String reponse = isd.rechercheProduit(motcle);
		System.out.println("Le r�sultat de la recherche: ");
		System.out.println(reponse);
		System.out.println("######## FIN RECHERCHE #########");
		System.out.println();
		
	}
	/**
	 * Proc�dure de liste des produits
	 * @param isd
	 * @throws RemoteException 
	 */
	private static void listeProduit(IServiceDistant isd) throws RemoteException{
		System.out.println("################################");
		System.out.println("   LISTE DE TOUS LES PRODUITS   ");
		System.out.println("################################");
		System.out.println(isd.listeProduit());
		System.out.println("########### FIN LISTE ##########");
		System.out.println();
		
	}

}
