
public class BarrysQuietApp {
	public static void main(String[] args) {
		int gumballs;
		int kids;
		int gumballsPerKid;
		boolean eachKidGetsTen;
		
		gumballs = 140;
		kids = 15;
		gumballsPerKid = gumballs / kids;
		
		System.out.print("True or False? ");
		System.out.println("Each kid gets 10 gunmballs.");
		eachKidGetsTen = gumballsPerKid >= 10;
		System.out.println(eachKidGetsTen);
	}
}
