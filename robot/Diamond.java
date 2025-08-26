package robot;
import kareltherobot.*;


public class Diamond implements Directions{

    public static void main(String[] args) {

        World.setVisible(true);// allows us to see the run output
        // the bigger the street, the farther north
        World.setSize(20,20);
        World.setDelay(3);

        // The line below creates a Robot that we will refer to as rob
        // Find out what the numbers and direction do!
        // Put rob in a better location for your initials.
       // Robot rob = new Robot(15,2,South,9);

         Robot rob = new Robot(15,2,South,900);

        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.move();
        rob.move();
        rob.move();
        rob.move();
        
      
        for (int i =1; i<=4; i++) {
            rob.putBeeper();
            rob.turnLeft();
            rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.putBeeper();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        }
        // Want a second robot?  No prob.  They are cheap :)
        //Robot dude = new Robot(7,5,West,9);
        // examples of commands you can invoke on a Robot
      //  rob.move();// move one step in the direction it is facing


        // starting the letter R
        //rob.putBeeper();



        // done with the line, now on the curve
        // rob.turnLeft();

    }
}
