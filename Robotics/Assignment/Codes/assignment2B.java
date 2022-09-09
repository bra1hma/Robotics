/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotics;

/**
 *
 * @author admin
 */
import ch.aplu.robotsim.*;
public class assignment2B {
   assignment2B () {
        TurtleRobot t = new TurtleRobot ();
        t.setTurtleSpeed (100);
        while (true) {
            t.forward (2);
            t.left (2);
        }
     }
    public static void main (String [] args)  {
        new assignment2B ();
    } 
}

