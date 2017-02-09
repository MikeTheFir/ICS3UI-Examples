
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city and robot
        City kitchener = new City();
        Robot kypress = new Robot(kitchener, 3, 0, Direction.EAST);
        //make walls
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);  
        // make a thing
        new Thing(kitchener, 3, 1);
        // move and turn the robots
        kypress.move();
        kypress.pickThing();
        kypress.turnLeft();
        kypress.move();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.move();
        kypress.turnLeft();
        kypress.move();
        kypress.move();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.move();
        kypress.putThing();
        kypress.move();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.move();
        kypress.turnLeft();
        kypress.move();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.turnLeft();
        kypress.move();
        kypress.move();
        kypress.turnLeft();
    }
}
