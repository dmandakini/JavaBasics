//Name: Mandakini Das
//ID:   71776990
//mail: mxd76990@ucmo.edu
//Question: Lottery Number Generation

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String randomGenerated = "" + (int)(Math.random() * 10)
				  + (int)(Math.random() * 10);
		
		System.out.print("Enter any two digit number::");
		Scanner input = new Scanner(System.in); 
        String userInput = input.nextLine(); 
        
        // Get digits from randomGenerated
        char rgDigit1 = randomGenerated.charAt(0);
        char rgDigit2 = randomGenerated.charAt(1);

        // Get digits from user
        char userDigit1 = userInput.charAt(0);
        char userDigit2 = userInput.charAt(1);
        
        // Rule Number1: Check complete number
        if (userInput.equals(randomGenerated))
        	 System.out.println("Exact match: you win $10,000");
        // Rule Number2: Check either digits matches
        else if (userDigit2 == rgDigit1
           	 && userDigit1 == rgDigit2)
           	 System.out.println("Match all digits: you win $3,000");
        // Rule Number3: Check atleast on  digit matches
        else if (randomGenerated.contains(String.valueOf(userDigit1))
              	 || randomGenerated.contains(String.valueOf(userDigit2))
              	)
           System.out.println("Match one digit: you win $1,000");
        // Rule Number4: Nothing Matches
        else
        System.out.println("No Match Found");	
        // Print Random Generated lottery number	
        System.out.println("Random Generated number::" + randomGenerated);
	}

}
