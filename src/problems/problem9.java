package problems;

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task 9- Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
             
		int input[]= {12,34,66,85,900};
		  // Initially loop is set to run from 0-input.length
        for (int i = 0; i < input.length; i++) {
            // terminate if it find number 85 
            if (input[i] == 85)
                break;
 
            System.out.println("i: " +  input[i]);
        }
        System.out.println("Loop complete.");
		
		

	}

}
