import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.util.*;

public class CourseRegisterRobot {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// get
																				// the
																				// size
																				// of
																				// the
																				// screen
			// System.out.println("screen width is :"+ screenSize.width);

			try {
				Robot robot = new Robot();

				// TODO Auto-generated catch block
				// e1.printStackTrace();

				robot.mouseMove(108, 867);

				robot.delay(1000);

				robot.mousePress(InputEvent.BUTTON1_MASK);

				robot.delay(300);
				// put the random number in
				int k = (int)( Math.random()*10*1000*2);
				try {
					System.out.println("sleep for : "+k * 2/1000+"seconds");//sleep for lower than 20seconds
				  	Thread.sleep(k);
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				robot.mouseRelease(InputEvent.BUTTON1_MASK);

				// second click

				robot.mouseMove(257, 372);

				robot.delay(1000);

				robot.mousePress(InputEvent.BUTTON1_MASK);

				robot.delay(300);
				// put the random number in
				int k2 = (int)( Math.random()*10*1000*2);//sleep for lower than 20seconds
				try {
					System.out.println("sleep for : "+k2 * 2/1000+"seconds");
					Thread.sleep(k2 * 2);
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			}

			catch (AWTException e) {
				e.printStackTrace();
			}

		}
	}
}
