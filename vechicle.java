public class Vehicle{
	public static void main(String []args) {
	PetrolEngine pE= new PetrolEngine();
		pE.start();
		pE.stop();
		
	DiselEngine de = new DiselEngine();
	  de.start();
	  de.stop();
	}
}