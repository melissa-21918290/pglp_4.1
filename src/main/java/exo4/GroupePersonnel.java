package exo4;

import java.util.ArrayList;
import java.util.List;

public class GroupePersonnel implements Hierarchie {
	private List<Hierarchie> personne = new ArrayList<Hierarchie>();
	
	public void print() {
	
		for(Hierarchie composant: personne) {
			composant.print();
		}
	}
	
	public void add(Hierarchie composant) {
		personne.add(composant);
	}
	
	public void remove(Hierarchie composant) {
		personne.remove(composant);
	}

}