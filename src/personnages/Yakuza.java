package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		int butin = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l�?");
		parler(victime.getNom() + ",si tu tiens � la vie donne moi ta bourse!");
		victime.seFaireExtorquer();
		gagnerArgent(butin);
		reputation++;
		parler("J'ai piqu� les " + butin + " sous de " + victime.getNom() + ", ce qui me fait " + super.getArgent() + " sous dans ma poche. Hi ! Hi !");
		
	}
	public void perdre() {
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai d�shonor� le clan de " + clan);
		perdreArgent(getArgent());
		reputation --;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan +"? Je l'ai d�pouill� de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation ++;
	}
}

