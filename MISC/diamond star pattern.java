package prac;
import java.util.*;

public class Test {
	
	
	
	public static void main(String[] args) {
		int n = 5;
		
		for(int row = 1 ; row <= n ; row++) {
			
			for(int i = 1 ; i <= n-row ; i++) {//loop to leave initial spaces
				System.out.print(" ");
			}
			
			for(int i=1 ; i<=row ; i++) {//loop to star
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		for(int row = n-1 ; row > 0 ; row--) {
			
			for(int i = 1 ; i <= n-row ; i++) {
				System.out.print(" ");
			}
			
			for(int i=1 ; i<=row ; i++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}

}
