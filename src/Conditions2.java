
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City k = new City();
        Robot karel = new Robot(k, 4, 1, Direction.EAST);
        // turn on the thing counter
        k.showThingCounts(true);
        
        new Thing(k, 4, 2);
        new Thing(k, 4, 3);
        new Thing(k, 4, 3);
        new Thing(k, 3, 3);
        new Thing(k, 2, 3);
        new Thing(k, 2, 3);
        new Thing(k, 2, 3);
        new Thing(k, 2, 3);
        
        // step onto first part of path
        karel.move();
        
        // loop
        while(true){
        // if there are things
        // pick them all up
        while(karel.canPickThing()){
            karel.pickThing();
        }
        // if holding 1 thing, move
        if(karel.countThingsInBackpack() == 1){
            //drop things
            karel.putThing();
            //move
            karel.move();
            // if holding 2 tihngs, turn left
        }else if(karel.countThingsInBackpack() == 2){
            //put things
            karel.putThing();
            karel.putThing();
            //move
            karel.turnLeft();
            karel.move();
            // if holding 3 things, turn right
        }else if(karel.countThingsInBackpack() == 3){
            //put things
            karel.putThing();
            karel.putThing();
            karel.putThing();
            //move
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
        }
        // if holding 4 things, stop
        
        
    }
}
