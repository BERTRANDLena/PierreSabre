package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom,"th�",argent);
	}	
	
	public int seFaireExtorquer() {
		super.parler("J'ai tout perdu! Le monde est vraiment trop injuste...");
		return super.perdreArgent(getArgent());
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent + " sous! Je te remercie g�n�reux donateur.");
	}
}
