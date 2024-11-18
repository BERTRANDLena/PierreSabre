package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = (int) (0.1 * getArgent());
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = 2*honneur;
		if (force >= adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur ++;
			parler("Je t'ai eu petit yakuza!");
			adversaire.perdre();
		}else {
			honneur--;
			int argentjeu = getArgent();
			perdreArgent(argentjeu);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentjeu);
		}
		
		
	}
	

}
