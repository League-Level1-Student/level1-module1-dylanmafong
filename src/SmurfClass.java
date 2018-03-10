
public class SmurfClass {
public static void main(String[] args) {
	Smurf c = new Smurf("bobby");
	Smurf b = new Smurf("blob");
	Smurf a = new Smurf("bob");
	a.eat();
	a.getName();
	System.out.println(a.getName());
	
	b.getName();
	System.out.println(b.getName());
	b.getHatColor();
	b.isGirlOrBoy();
	c.getName();
	System.out.println(c.getName());
	c.getHatColor();
	c.isGirlOrBoy();
	
	
	
}
}
