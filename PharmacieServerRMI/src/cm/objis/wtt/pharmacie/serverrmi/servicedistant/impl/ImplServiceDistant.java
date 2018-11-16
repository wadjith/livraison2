package cm.objis.wtt.pharmacie.serverrmi.servicedistant.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Vector;

import cm.objis.wtt.pharmacie.domaine.Produit;
import cm.objis.wtt.pharmacie.serverrmi.servicedistant.IServiceDistant;
import cm.objis.wtt.pharmacie.serverrmi.util.DateUtil;


@SuppressWarnings("serial")
public class ImplServiceDistant extends UnicastRemoteObject implements IServiceDistant{
	
	/**
	 * Conserve les produits enregistrés
	 */
	private Vector<Produit> listProduit;


	public ImplServiceDistant() throws RemoteException {
		super();
		this.listProduit = new Vector<Produit>();
	}


	@Override
	public String welcome() throws RemoteException {
		Date date = new Date();
		String message = "Date et heure de connexion: " + DateUtil.convertirdateString(date) + "\n" +
				"BIENVENUE SUR LE SERVEUR DE GESTION DES PHARMACIES;" + "\n";
		return message;
	}



	@Override
	public String enregistreProduit(String ref, String libelle, double prix, int qte) throws RemoteException {
		Produit p = new Produit(ref, libelle, prix, qte);
		this.listProduit.add(p);
		return this.detailProduit(p);
	}



	@Override
	public String detailProduit(Produit p) throws RemoteException {
		return p.toString();
	}



	@Override
	public String rechercheProduit(String motcle) throws RemoteException {
		Vector<Produit> result = new Vector<>();
		for (Produit p : listProduit) {
			if(p.getLibelle().contains(motcle)){
				result.add(p);
			}
		}
		return (result.size() > 0) ? result.toString() : "Aucun produit ne correspond à votre mot clé";
	}


	@Override
	public String listeProduit() throws RemoteException {
		return this.listProduit.toString();
	}

}
