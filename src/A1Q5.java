
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city and robot
        City kitchener = new City();
        Robot mtf = new Robot(kitchener, 3, 3, Direction.EAST);
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        // add letter to robot to label it
        mtf.setLabel("K");
        maria.setLabel("M");
        // create walls
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        // create ball-like things
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 0, 0);
        //move and turn the robots
        mtf.turnLeft();
        mtf.turnLeft();
        mtf.move();
        mtf.turnLeft();
        mtf.turnLeft();
        mtf.turnLeft();
        mtf.move();
        mtf.pickThing();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        mtf.move();
        maria.move();
        mtf.pickThing();
        mtf.turnLeft();
        maria.pickThing();
    }
}
