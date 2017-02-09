
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city and robots
        City kitchener = new City();
        Robot daddyTyrone = new Robot(kitchener, 0, 0, Direction.SOUTH);
        Robot xluiisa = new Robot(kitchener, 0, 1, Direction.SOUTH);
        //create walls
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        //make the robots move and turn
        xluiisa.move();
        xluiisa.turnLeft();
        daddyTyrone.move();
        xluiisa.move();
        daddyTyrone.move();
        xluiisa.turnLeft();
        xluiisa.turnLeft();
        xluiisa.turnLeft();
        xluiisa.move();
        xluiisa.turnLeft();
        xluiisa.turnLeft();
        daddyTyrone.turnLeft();
        xluiisa.turnLeft();
        xluiisa.move();
        daddyTyrone.move();
    }
}
