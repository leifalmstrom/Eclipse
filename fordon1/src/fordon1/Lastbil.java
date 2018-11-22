package fordon1;

public class Lastbil extends Motorfordon{
	int maxL;
	
	public Lastbil(String nr, int last) {
		super(nr);
		maxL = last;
	}
	@Override
	public void skriv() {
		super.skriv();
	    System.out.println("En lastbil med maximalt " + maxL+ " kg");
	}
	
}
