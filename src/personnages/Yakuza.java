package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercant) {
		int butin = commercant.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(commercant.getNom() + ",si tu tiens à la vie donne moi ta bourse!");
		commercant.seFaireExtorquer();
		gagnerArgent(butin);
		reputation++;
		parler("J'ai piqué les " + butin + " sous de " + commercant.getNom() + ", ce qui me fait " + super.getArgent() + " sous dans ma poche. Hi ! Hi !");
		
	}
}
