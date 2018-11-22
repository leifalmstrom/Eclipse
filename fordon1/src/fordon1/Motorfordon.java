package fordon1;

class Motorfordon implements Fordon {
	  String regNum;
	  public Motorfordon(String nr) {
	    regNum = nr;
	  }
	  @Override
	  public void skriv() {
	    System.out.println("Ett motorfordon med reg nr: " + regNum);
	  }
}

