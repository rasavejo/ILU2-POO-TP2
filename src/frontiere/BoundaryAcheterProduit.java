package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		System.out.println("Quel produit voulez vous achetez ? ");
		String produit = scan.next();
		Gaulois[] vendeurs = controlAcheterProduit.trouverListeVendeur(produit);
		if (vendeurs.length == 0 ) {
			System.out.println("Personne ne vend ceci");
		} else {
			System.out.println("Les vendeurs sont : ");
			for (int i = 0;i<vendeurs.length;i++) System.out.println("-" + i + ": "  + vendeurs[i].getNom());
			int choix = Clavier.entrerEntier("Choississez un vendeur");
			while (choix <= 0 || choix > vendeurs.length) {
				System.out.println("Vous avez entrer une valeur incorrecte");
				choix = Clavier.entrerEntier("Choississez un vendeur");
			}
			controlAcheterProduit.acheterProduit(vendeurs[choix],Clavier.entrerEntier("Quantite ? "));
		}
	}
}
