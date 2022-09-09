
import ch.aplu.robotsim.*;

public class Prac_4 {
    static { 
        RobotContext.setStartPosition(32,495);
        RobotContext.useBackground("sprites/road.gif");
     }
    
    Prac_4(){
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        LightSensor ls= new LightSensor(SensorPort.S3);
        r.addPart(g);
        r.addPart(ls);
        g.forward();
        g.setSpeed(50);
        while(true){
            int v =ls.getValue();
            if(v < 100)
                g.forward();
            if(v > 350 && v<750)
                g.leftArc(0.005);
            if(v > 800)
                g.rightArc(0.005);
        }
    }
    
    public static void main (String args[]){
        new Prac_4();
    }
}
