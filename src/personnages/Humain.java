package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println("Bonjour! Je m'apelle " + nom + " et j'aime boire du " + boisson);
	}

	public void parler(String texte) {
		System.out.println(nom + ": <<" + texte + ">>");
	}

	public void boire() {
		System.out.println("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un kimono � " + prix
					+ " sous.");
		}
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}
}