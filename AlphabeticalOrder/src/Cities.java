//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu
//Question: Sort Cities

import java.util.Scanner;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter first city Name:");
		Scanner input = new Scanner(System.in); 
		  
		// Reads First City input from user
        String firstCity = input.nextLine(); 
        	
        //Reads First City input from user
        System.out.print("Enter second city Name:"); 
        String secondCity = input.nextLine(); 
        
        //Reads First City input from user
        System.out.print("Enter third city Name:");  
        String thirdCity = input.nextLine();
        
        String temp;
        //Compare secondCity with firstCity and  thirdCity
        if((secondCity.compareTo(firstCity) < 0) && (secondCity.compareTo(thirdCity) <0 ))
        {
        	    temp = firstCity;
        	    firstCity = secondCity;
        	    secondCity = temp;
        }
      //Compare thirdCity with firstCity and  secondCity
        else if((thirdCity.compareTo(firstCity) < 0) && (thirdCity.compareTo(secondCity) <0 ))
        {
        	    temp = firstCity;
        	    firstCity = thirdCity;
        	    thirdCity = temp;
        }
        else if(thirdCity.compareTo(secondCity) <0 )
        {
        	    temp = secondCity;
        	    secondCity = thirdCity;
        	    thirdCity = temp;
        }
        System.out.println("The three cities in alphabetical order are: " + firstCity+ " "+ secondCity + " "+ thirdCity);
	}

}
