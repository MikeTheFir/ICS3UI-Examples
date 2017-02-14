
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
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot mtf = new Robot(kw, 1, 1, Direction.EAST);
        
        // put up wall
        new Wall(kw, 1, 5, Direction.EAST);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        new Thing(kw, 0, 1);
        // infinite loop
        while(mtf.frontIsClear())
        // move and turn left
        mtf.move();
        //mtf.turnLeft();
        
        // if there is something to pick up
        if(mtf.canPickThing()){
        // pick up everything
        mtf.pickThing();
        break;
    }
        // did mtf hit as wall
        if(!( mtf.frontIsClear()) ){
        mtf.turnLeft();
        
}
