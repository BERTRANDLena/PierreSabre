package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant commercant) {
		int don = (int) (0.1 * getArgent());
		parler(commercant.getNom() + " prend ces " + don + " sous.");
		commercant.recevoir(don);
		perdreArgent(don);
	}
	

}
