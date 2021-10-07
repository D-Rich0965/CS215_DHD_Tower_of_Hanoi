import java.util.*;
import java.io.*;
import java.math.*;

public class HanoiMain {

	static void towerOfHanoi(int n, char currentRod, char newRod, char tempRod) {
		
		if (n==1) {
			System.out.println("Move disk 1 from rod " + currentRod + " to rod " + newRod);
			return;
		}
		
		towerOfHanoi(n-1, currentRod, tempRod, newRod);
			System.out.println("Move disk " +n+ " from rod " +currentRod+ " to rod " +newRod);
			towerOfHanoi(n-1, tempRod, newRod, currentRod);
	}
	
	public static void main(String args[]) {
		int n=7;
		towerOfHanoi(n,'A','C','B');
	}
	
}
