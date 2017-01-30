package fr.starwars.figurines;

import java.util.ArrayList;

public class Stock {
	
	ArrayList<Personnages> StockPersonnages;
	ArrayList<PersosAvecForce> StockForce;
	ArrayList<Troopers> StockTroopers;
	
	
	
	public Stock() {
		StockPersonnages = new ArrayList<>();
		StockForce = new ArrayList<>();
		StockTroopers = new ArrayList<>();
	}

	public void creerFigurine(String nomClasse, Troopers nomFigurine){
		
		switch (nomClasse) {
		
		case "troopers":
			Troopers nomFigurine1 = new Troopers();
			StockPersonnages.add(new Troopers());
			StockTroopers.add(new Troopers());
			
			break;
			
		case "force":
			StockPersonnages.add(new PersosAvecForce());
			StockForce.add(new PersosAvecForce());
			
			break;
			
		case "perso":
			StockPersonnages.add(new Personnages());
			
			break;

		default:
			System.out.println("Mauvais paramètre !");
			break;
		}
		
	}
}
