package cm.objis.wtt.pharmacie.serverrmi.servicedistant;

import java.rmi.Remote;
import java.rmi.RemoteException;
import cm.objis.wtt.pharmacie.domaine.Produit;

/**
 * @author WADJI Thierry
 * @version 1.0
 * Interface des services distants
 *
 */
/**
 * @author MINMAP-WTT
 *
 */
/**
 * @author MINMAP-WTT
 *
 */
public interface IServiceDistant extends Remote{
	
	/**
	 * Enregistre les produits dans l'application et affiche le d�tail du produit enregist�.
	 * 
	 * @param ref: r�ference du Produit
	 * @param libelle: Libelle du Produit
	 * @param prix: Prix du produit
	 * @param qte: quantit� de produit
	 * @throws RemoteException
	 * @return String : D�tail sur le produit enregistr�
	 * 
	 * 
	 */
	public String enregistreProduit(String ref, String libelle, double prix, int qte) throws RemoteException;
	
	/**
	 * 
	 * @param p: un objet Produit
	 * @throws RemoteException
	 * @return: un String repr�sentant les d�tails sur le produit
	 */
	public String detailProduit(Produit p) throws RemoteException;
	
	/**
	 * Recherche les produits dont le libelle contient le motcle.
	 * 
	 * @param motcle
	 * @throws RemoteException
	 * @return
	 * Une chaine de caract�re contenant la liste des produits retrouv�s.
	 */
	public String rechercheProduit(String motcle) throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 * @return {@link String}
	 * 
	 */
	public String listeProduit() throws RemoteException;
	
	/**
	 * @return Un message de bienvenue au client 
	 * @throws RemoteException
	 */
	public String welcome() throws RemoteException;
	
	

}
