package fordon1;

public class FordonTest2 {
	public static void main(String[] arg) {	
		
		Fordon[] ford = new Fordon[100];
		
		ford[0] = new Personbil("ABC123", 5);
		ford[1] = new Lastbil("XYZ999", 10000);
		ford[2] = new Personbil("PPP000", 6);
		ford[3] = new Cykel(10);
				
		for (Fordon f : ford){
			if (f != null){ //arrayen är 100 lång
				f.skriv();//dynamisk bindning
				System.out.println();//bara för mellanrum
			}
		}
	
			
	}

}
