

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
RaceCar a = new RaceCar("a",5);
		// 3. Get the RaceCar to print its position in the race.
a.getPositionInRace();
System.out.println(a.getPositionInRace());
		// 4. Crash the RaceCar
		a.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
				if(a.needsPitStop==true) {
					a.pit();
				}
				
		// 6. Help the car move into first place.
		a.overtake();
		a.overtake();
		a.overtake();
		a.overtake();
		a.overtake();
		a.overtake();
		a.overtake();
		a.overtake();
	}

}