import java.util.Scanner;

/*Simple program that takes the next 5 inputs from the user
 * and takes the average of those numbers
*/
public class average {
	public static void main(String[] args) {
		Scanner myKeyboard= new Scanner(System.in);
		int total =0;
		int grade;
		double average;
		int counter=0;
		
		while(counter <5){
			//while loops 5 times
			grade = myKeyboard.nextInt(); //next integer will get taken by the code
			total = total+grade; //integer will be added to the total
			counter++;
		}
		
		average = total/5;
		System.out.println("Your average is: "+ average);
		
}
}
