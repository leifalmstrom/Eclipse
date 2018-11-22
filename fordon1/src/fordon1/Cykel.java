package fordon1;

public class Cykel implements Fordon{
	int antVäxlar;
	
	public Cykel(int växl) {
		antVäxlar = växl;
	}
	@Override
	public void skriv() {
	    System.out.println("En cykel med " + antVäxlar + " växlar");
	}

}
