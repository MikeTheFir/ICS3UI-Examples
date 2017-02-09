
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city adn robot created
        City kitchener = new City();
        Robot tim = new Robot(kitchener, 0, 2, Direction.WEST);
        // walls created
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        // robot moved and turned
        tim.move();
        tim.move();
        tim.turnLeft();
        tim.move();
        tim.move();
        tim.move();
        tim.turnLeft();
        tim.move();
        tim.move();
        tim.move();
        tim.turnLeft();
        tim.move();
        tim.move();
        tim.move();
        tim.turnLeft();
        tim.move();
    }
}
