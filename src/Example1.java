
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener
        City kitchener = new City();
        
        // Creating a robot
        Robot papaDragon = new Robot(kitchener, 2, 1, Direction.EAST);
       papaDragon.move();
        papaDragon.turnLeft();
        
        
    }
}
