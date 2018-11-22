package fordon1;

import java.util.ArrayList;

public class FordonsTest3 {
	public static void main(String[] arg) {	
		
		ArrayList<Fordon> f = new ArrayList<>();
		
		f.add(new Personbil("ABC123", 5));
		f.add(new Lastbil("XYZ999", 10000));
		f.add(new Personbil("PPP000", 6));
		f.add(new Cykel(10));
				
		for (Fordon fordon : f){
			if (fordon != null){ //arrayen är 100 lång
				fordon.skriv();//dynamisk bindning
				System.out.println();//bara för mellanrum
			}
		}
	
			
	}

}
