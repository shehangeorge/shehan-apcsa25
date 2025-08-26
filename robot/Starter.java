package robot;
import kareltherobot.*;


public class Starter implements Directions{

  public static void main(String[] args) {

    World.setVisible(true);// allows us to see the run output
    // the bigger the street, the farther north
    World.setSize(20,20);
     World.setDelay(3);


    // The line below creates a Robot that we will refer to as rob
    // Find out what the numbers and direction do!
    // Put rob in a better location for your initials.
    Robot rob = new Robot(16,3,South,900);
    

    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot
    rob.move();// move one step in the direction it is facing
    rob.turnLeft();


    // starting the letter R
 rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
  
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
   
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.move();
    rob.move();
    
    
    Robot dude = new Robot(15,15,West,900);
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.turnLeft();
    dude.turnLeft();
    dude.move();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.turnLeft();
    dude.turnLeft();
    dude.turnLeft();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.putBeeper();
    dude.move();
    dude.move();
    dude.move();
    dude.move();
    dude.move();
    dude.move();
    dude.move();

    // done with the line, now on the curve
    // rob.turnLeft();

  }
}
