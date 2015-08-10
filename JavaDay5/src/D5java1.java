import java.util.Scanner;
public class D5java1 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
