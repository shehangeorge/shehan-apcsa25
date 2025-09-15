package robot;

import kareltherobot.*;

public class Roomba implements Directions {
	private static int st = 0;
	private static int av = 0;	

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		//String worldName = "robot/basicRoom.wld";
		String worldName = "robot/finalTestWorld2024 (1).wld";

		
		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 25, 11);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	int totalBeepers = 0;
	
	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location.
		roomba = new Robot(26, 149, West, 0);

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
	


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it

		int totalArea = 0;

		int largestPile = 0;
		
		int previousPile = 0;

		int numberOfPiles = 0;

		



		while(roomba.frontIsClear()){
			
			roomba.move();
			totalArea++;

			if (roomba.nextToABeeper()){
				previousPile = 0;
				numberOfPiles++;

		
			while(roomba.nextToABeeper()){

				totalBeepers++;
				roomba.pickBeeper();
				previousPile++;


				if (previousPile>largestPile){

					largestPile = previousPile;
					
					st = roomba.street();
					av = roomba.avenue();
				}
			}

			}

			if (!roomba.frontIsClear()){

			if(roomba.facingEast()){

				roomba.turnLeft();
				roomba.move();
				totalArea++;
				roomba.turnLeft();
				
			}

			else {

				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.move();
				totalArea++;
				roomba.turnLeft();
				roomba.turnLeft();
				roomba.turnLeft();

			}

		
			
		}


		
	}

	System.out.println("STATISTICS");
	System.out.println("the total area of the world: ");
	System.out.println(totalArea);
	System.out.print("the total number of piles: ");
	System.out.println(numberOfPiles);
	System.out.println("the percent dirty: ");
	System.out.println(100* numberOfPiles/totalArea);
	System.out.print("the average pile size: ");
	System.out.println((totalBeepers/numberOfPiles));
	System.out.println("Location of Largest Pile: (" + st + ","  + av + ")" );
	System.out.print("largest pile has: ");
	System.out.println(largestPile);
	return totalBeepers;


	

}
}