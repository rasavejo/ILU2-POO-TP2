package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;
import personnages.Gaulois;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public Gaulois[] trouverListeVendeur(String produit) {
		return village.rechercherVendeursProduit(produit);
	}
	
	public int acheterProduit(Gaulois vendeur,int quantite) {
		Etal etal = village.rechercherEtal(vendeur);
		return etal.acheterProduit(quantite);
	}
}
