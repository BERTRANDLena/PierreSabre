package personnages;

public class Commercant extends Humain {
	private String boisson = "thé";
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	protected void parler() {
		return "Le commerçant " + super.parler("texte");
	}	
	
	public int seFaireExtorquer() {
				
	}
	
	public void recevoir(int argent) {
		
	}
}
