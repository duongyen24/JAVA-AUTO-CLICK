import java.awt.*;
import java.awt.event.InputEvent;

public class Main {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception{
     Robot robot = new Robot();
     robot.delay(5000);
     while(true){
         robot.mousePress(InputEvent.BUTTON1_MASK);
         robot.delay(1000);
         robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }
}