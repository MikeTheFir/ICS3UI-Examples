
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city and robot created
        City kitchener = new City();
        Robot luiisa = new Robot(kitchener, 1, 2, Direction.SOUTH);
        // new walls created
        new Wall(kitchener, 1, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        // new thing created
        new Thing(kitchener, 2, 2);
        // robots are turned and moved
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.pickThing();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.move();
        luiisa.turnLeft();
        luiisa.turnLeft();
        luiisa.turnLeft();
        
        
        
    }
}
