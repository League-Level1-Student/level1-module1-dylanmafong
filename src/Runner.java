
public class Runner {
	public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	Spongebob.getName();
	System.out.println(Spongebob.getName());
	Spongebob.eat();
	Spongebob.laugh();
	
	SeaCreature Patrick = new SeaCreature("Patrick");
	Patrick.getName();
	System.out.println(Patrick.getName());
	Patrick.eat();
	Patrick.laugh();
	}
}
