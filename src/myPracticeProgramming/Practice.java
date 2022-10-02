package myPracticeProgramming;

import java.util.*;

public class Practice {
	public static void main(String[] args ){
		//Make an ArrayList of 5
	
		ArrayList<String> sportsTypes = new ArrayList<>(Arrays.asList("Football", "Basketball", 
				"Soccer", "Golf", "Hockey"));
		//Print to console
		System.out.println(sportsTypes);
		//Remove 3 objects
		sportsTypes.remove((0));
		sportsTypes.remove((0));
		sportsTypes.remove((0));
		
		//Print new list to console
		System.out.println(sportsTypes);
		
		//Print random number
		
		System.out.println(Math.random());
		 int upperBound = 20;
		 int lowerBound = 10;
		 //code for random number between 0-100
		 int randomNum = (int)(Math.random() * 101);
		 //Print to console
		 System.out.println(randomNum);
	}
		 
		 public static int aRange(int start, int finish)
			{
				Random a = new Random();
				int aInt = start + a.nextInt(finish + 1 - start) + start;
				return aInt;
				
			//testing testing 123

	
	}
	}