package loosecouplingexample;

public class Main {
	
	public static void main(String[] args) {
		Traveler traveler = new Traveler();
		traveler.setV(new Car());//inject car dependency
		traveler.startJourney();
		traveler.setV(new Bus());//inject bus dependency
		traveler.startJourney();
	}

}

/*
Singleton Pattern
Factory method Pattern
Proxy Pattern
Template Pattern
FrontController Pattern
*/