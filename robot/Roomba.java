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
//the world has to be changed to the final testing world in order to be seen in the port

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 25, 11);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");
	}
	// declared here so it is visible in all the methods!
	private Robot roomba;
	int totalBeepers = 0;
	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {
		// *A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // *Make sure it starts at startX and startY location.
		roomba = new Robot(26, 149, West, 0);
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0);
	


		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */

		// *the line below causes a null pointer exception
		// *what is that and why are we getting it

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
//in order to total up the beepers into one value at the end
		
			while(roomba.nextToABeeper()){
				totalBeepers++;
				roomba.pickBeeper();
				previousPile++;
//so the beepers can be added to the total number to be displayed at the end

				if (previousPile>largestPile){
					largestPile = previousPile;	
//in order for the largest pile to be determined at the end, including how many beepers it has and its location	
					st = roomba.street();
					av = roomba.avenue();
//so the location can be displayed as coordinates
				}
			}
			}
			if (!roomba.frontIsClear()){
			if(roomba.facingEast()){
				roomba.turnLeft();
				roomba.move();
				totalArea++;
				roomba.turnLeft();
//explanation at the bottom -- basically when it's looking east it turns to the left and vice versa
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
//follows Ms. Cyr's snaking method, where the roomba goes back and forth -- when it hits a wall, the code tells it which direction to u-turn in so it can keep looking for beepers and not stay stuck at a wall
			}		
		}
	}

	System.out.println("STATISTICS");
	System.out.println("the total area of the world: ");
	System.out.println(totalArea);
	System.out.print("total number of piles: ");
	System.out.println(numberOfPiles);
	System.out.println("percent of the world that was dirty: ");
	System.out.println(100* numberOfPiles/totalArea);
	System.out.print("average pile size: ");
	System.out.println((totalBeepers/numberOfPiles));
	System.out.print("the largest pile has: ");
	System.out.println(largestPile);
	System.out.println("the location of largest pile: (" + st + ","  + av + ")" );
	
	return totalBeepers;


	

}
}
//most comments with a * were written by Ms. Cyr, while all the other explanations of each segment of the code were written by me