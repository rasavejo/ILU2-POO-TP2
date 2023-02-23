package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis d�sol� " + nomVendeur + " mais il "
					+ "faut �tre un habitant de notre "
					+ "village pour commercer ici.");
		} else {
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("Desole " + nomVendeur
						+ " je n'ai plus d'etal qui ne soit pas deja occupe");
			} else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait il me reste un etal pour vous");
		System.out.println("Il me faudrait quelques renseignements");
		System.out.println("Quel produit souhaitez vous vendre");
		String produit = scan.next();
		int nbProduit = Clavier.entrerEntier("Combien souhaitez vous en vendre");
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + " s'est installe a l'etal " + numeroEtal);
		}
	}
}
