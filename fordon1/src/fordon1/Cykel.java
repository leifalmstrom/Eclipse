package fordon1;

public class Cykel implements Fordon{
	int antV�xlar;
	
	public Cykel(int v�xl) {
		antV�xlar = v�xl;
	}
	@Override
	public void skriv() {
	    System.out.println("En cykel med " + antV�xlar + " v�xlar");
	}

}
