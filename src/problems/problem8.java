package problems;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Task 8- Write a program to print below students marks who have scored above 80
		//Example- 78,12,89,55,35
		//Output-   89
		
		
		 int student_mark[]= {78,12,89,55,25};
		 for(int i=0; i<=4 ;i++)
		 {
		 if (student_mark[i] > 80)
		 {
			 System.out.print(student_mark[i]);
		 }
		 }
		 

	}

}
