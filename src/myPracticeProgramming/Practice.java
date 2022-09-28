package myPracticeProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
	public static void main(String[] args ){
		ArrayList<String> sportsTypes = new ArrayList<>(Arrays.asList("Football", "Basketball", 
				"Soccer", "Golf", "Hockey"));
		
		System.out.println(sportsTypes);
		
		sportsTypes.remove((0));
		sportsTypes.remove((0));
		sportsTypes.remove((0));
		System.out.println(sportsTypes);
		
	}

}
