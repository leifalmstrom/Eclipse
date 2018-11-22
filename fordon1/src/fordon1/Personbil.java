package fordon1;

public class Personbil extends Motorfordon{
	int antPlats;
	
	public Personbil(String nr, int antal){
		super(nr);
		antPlats = antal;
	}
	@Override
	public void skriv(){
		super.skriv();
		System.out.println("En personbil med "+antPlats+" platser");
	}

}
