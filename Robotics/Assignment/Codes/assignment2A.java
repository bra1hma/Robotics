
package robotics;


import ch.aplu.robotsim.*;
public class assignment2A {


    assignment2A () {
            TurtleRobot t = new TurtleRobot ();
            t.setTurtleSpeed (100);
            while (true){
                t.forward(200);
                t.left (90);
            }
        }
    public static void main (String [] args) {
        new assignment2A ();
    }
}


