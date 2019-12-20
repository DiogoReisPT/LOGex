import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = begin();
		
		for(int i=1; i <= x; i++) {
			
			if( (i%3 == 0 || String.valueOf(i).contains("3")) && (i%5 == 0 || String.valueOf(i).contains("5")) && (i%3 == 0 && i%5 == 0) ) {
				System.out.println("lucky");
			}
			else if(i%3 == 0 && i%5 == 0) {
				System.out.println("fizzbuzz");
			}
			else if(i%5 == 0 || String.valueOf(i).contains("5")) {
				if(i%5 == 0 && String.valueOf(i).contains("5")) {
					System.out.println("buzz buzz");
				} else System.out.println("buzz");
			}
			else if(i%3 == 0 || String.valueOf(i).contains("3")) {
				if(i%3 == 0 && String.valueOf(i).contains("3")) {
					System.out.println("fizz fizz");
				} else System.out.println("fizz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
	
	
	
	private static int begin() {
		System.out.println("Enter the max number for the sequence (starts at 1) : ");
		int num;
		
		do{
			num = new Scanner(System.in).nextInt();
			if(num <= 1) {
				System.out.println("Number must be greater than 1 : ");
			}
		}while(num <= 1);
		
		System.out.println("THE RESULT IS BELOW");
		return num;
	}

	
}