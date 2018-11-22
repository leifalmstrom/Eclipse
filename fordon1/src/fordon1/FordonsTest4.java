package fordon1;

public class FordonsTest4 {
	
	public static void main(String[] arg) {	
		Fordon f =  new Personbil("ABC123", 5);
		f.skriv(); // dynamisk bindning
		//objektet Fordon går inte att skapa
		Fordon ff = new Fordon();
		ff.skriv();
	}
}
