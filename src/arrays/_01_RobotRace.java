package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		Robot[] robots = {new Robot()};
		for(int i = 0; i<5; i++) {
			robots[i] = new Robot();
		}
		
		for(int i = 0; i<5; i++) {
			robots[i].setX(x);
			robots[i].setY(y);
			x+=20;
			y+=20;
		}
	
		for(int i = 0; i<5; i++) {
			while(robots[i].getY()< top y) {
			Random rand = new Random();
			robots[i].move(rand.nextInt(50));
			}
		}
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
