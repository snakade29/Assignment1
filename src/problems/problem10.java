package problems;

public class problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 10- Write a program which will break the current execution if it find “Selenium”
		// Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
		
         String  input[] = {"Java","JavaScript","Selenium","Python","Mukesh"};
         
         for (int i = 0; i < input.length ; i++) {
             // terminate if it find number 85 
             if (input[i] == "Selenium")
                break ;
  
             System.out.println("i: " +  input[i]);
         }
         System.out.println("Loop complete.");
         
         
         
          
	}

}
