	************************************
*****  	Description de l'application:   	*****
	************************************

Pharmacie est une application d'aide à la gestion des produits (médicaments) en pharmacie. 
L'application offre les fonctionnalités suivantes:
- Enregistrement des produits;
- Recherche des produits par mot clé;
- Afficher le détail d'un produit;
- Liste de tous les produits. 

L'application fonctionne en mode client serveur RMI:
- Une application serveur qui fournit les fonctionnalités;
- Une application cliente qui permet d'accéder aux fonctionnalités.

	************************************
*****  	     Pré-requis à l'execution de l'application		*****
	************************************
Installer un jdk ou au moins un jre sur les ordinateurs clients et serveurs (au moins la version 1.8).
Avoir un réseau local qui va relier l'ordinateur "serveur" (il va exécuter la partie serveur de l'application) et le poste client
Pour l'installation suivre les étapes suivantes:
	- Rendez-vous sur le site d’Oracle : http://www.oracle.com/technetwork/java/javase/downloads/index.html;
	- Cliquez sur "Download3 pour télécharger le JDK;
	- Accepter la licence;
	- Cliquez sur le lien de téléchargement correspondant à la version de votre système d'exploitation
	pour démarrer le téléchargement;
	- Enregistrez le fichier dans un répertoire de votre choix; 
	- Double cliquez sur l'exécutable, l’assistant d’installation du JDK se lance;
	- Suivre simplement les étapes qui sont proposées.
On peut se rassurer que l'installation s'est bien effectuée en vérifiant la version de Java installée.
Sur l'invite de commande windows (cmd.exe) ou le shell linux, saisir la commande: java -version.
La réponse doit vous indiquer la version de Java installée.


	************************************
*****  	    Documentation:	    	*****
	************************************

L'application ayant deux parties, vous avez par conséquent une documentation par application. Veuillez suivre les indications suivantes pour accéder à la documentation:

1) Rendez vous dans le dossier 'PharmacieClientRMI\doc' pour le client ou le dossier 'PharmacieServerRMI\doc' pour le serveur.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:

1) Démarrer l'application serveur et rélever l'adresse IP et le port sur lequel l'application est exécutée;
2) Démarrer l'application cliente, qui aura besoin de l'adresse IP et le numéro de Port du Serveur.

Le démarrage des applications doit suivre les indications suivantes:
	
	a) 	A l'aide de l'interpreteur de commande (cmd.exe sous windows) ou shell sur Linux, placer vous dans le dossier où vous avez téléchargé le fichier compressé 	"PharmacieClient.jar" pour le client ou "PharmacieServer.jar" pour le serveur; 
		('cd [chemin]/[dossier cible]').

	b)	Entrer la commande 'java -jar PharmacieServer.jar' pour démarrer le serveur en premier;
	c)  Enfin la commande 'java -jar PharmacieClient.jar' pour démarrer le client.