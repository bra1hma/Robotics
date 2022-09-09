/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Gear;
/**
 *
 * @author admin
 */
public class assignment1A {

    public assignment1A() {
        NxtRobot r = new NxtRobot();
        Gear g = new Gear();
        r.addPart(g);
        
        g.setSpeed(100);
        
        while(true){
            g.forward(800);
            g.left(280);
        }
    }
    
    public static void main(String[] args){
        new assignment1A();
    }
    
}
