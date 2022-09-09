
import ch.aplu.robotsim.*;

public class Prac_3 {
    Prac_3(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(600);
            g.left(280);
        }
    }
    
    public static void main (String[] args) {
        new Prac_3();
    }
}
