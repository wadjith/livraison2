	************************************
*****  	Description de l'application:   	*****
	************************************

Pharmacie est une application d'aide � la gestion des produits (m�dicaments) en pharmacie. 
L'application offre les fonctionnalit�s suivantes:
- Enregistrement des produits;
- Recherche des produits par mot cl�;
- Afficher le d�tail d'un produit;
- Liste de tous les produits. 

L'application fonctionne en mode client serveur RMI:
- Une application serveur qui fournit les fonctionnalit�s;
- Une application cliente qui permet d'acc�der aux fonctionnalit�s.

	************************************
*****  	     Pr�-requis � l'execution de l'application		*****
	************************************
Installer un jdk ou au moins un jre sur les ordinateurs clients et serveurs (au moins la version 1.8).
Avoir un r�seau local qui va relier l'ordinateur "serveur" (il va ex�cuter la partie serveur de l'application) et le poste client
Pour l'installation suivre les �tapes suivantes:
	- Rendez-vous sur le site d�Oracle : http://www.oracle.com/technetwork/java/javase/downloads/index.html;
	- Cliquez sur "Download3 pour t�l�charger le JDK;
	- Accepter la licence;
	- Cliquez sur le lien de t�l�chargement correspondant � la version de votre syst�me d'exploitation
	pour d�marrer le t�l�chargement;
	- Enregistrez le fichier dans un r�pertoire de votre choix; 
	- Double cliquez sur l'ex�cutable, l�assistant d�installation du JDK se lance;
	- Suivre simplement les �tapes qui sont propos�es.
On peut se rassurer que l'installation s'est bien effectu�e en v�rifiant la version de Java install�e.
Sur l'invite de commande windows (cmd.exe) ou le shell linux, saisir la commande: java -version.
La r�ponse doit vous indiquer la version de Java install�e.


	************************************
*****  	    Documentation:	    	*****
	************************************

L'application ayant deux parties, vous avez par cons�quent une documentation par application. Veuillez suivre les indications suivantes pour acc�der � la documentation:

1) Rendez vous dans le dossier 'PharmacieClientRMI\doc' pour le client ou le dossier 'PharmacieServerRMI\doc' pour le serveur.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:

1) D�marrer l'application serveur et r�lever l'adresse IP et le port sur lequel l'application est ex�cut�e;
2) D�marrer l'application cliente, qui aura besoin de l'adresse IP et le num�ro de Port du Serveur.

Le d�marrage des applications doit suivre les indications suivantes:
	
	a) 	A l'aide de l'interpreteur de commande (cmd.exe sous windows) ou shell sur Linux, placer vous dans le dossier o� vous avez t�l�charg� le fichier compress� 	"PharmacieClient.jar" pour le client ou "PharmacieServer.jar" pour le serveur; 
		('cd [chemin]/[dossier cible]').

	b)	Entrer la commande 'java -jar PharmacieServer.jar' pour d�marrer le serveur en premier;
	c)  Enfin la commande 'java -jar PharmacieClient.jar' pour d�marrer le client.