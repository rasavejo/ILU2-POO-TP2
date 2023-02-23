package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infos = controlAfficherMarche.donnerInfosMarche();
		if (infos.length == 0 ) {
			System.out.println("Le marche est vide revenez plus tard.");
		} else {
			System.out.println(nomAcheteur + ", vous trouverez au marche.");
			for (int i = 0;i<infos.length;) {
				System.out.println("-" + infos[i++] + " qui vend " + infos[i++] + " " + infos[i++]);
			}
		}
	}
}
