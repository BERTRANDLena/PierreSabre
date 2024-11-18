package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","Kombucha",54);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong",0);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		yaku.extorquer(marco);
		
		
		
	}
}
