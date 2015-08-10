import java.util.Scanner;
public class D5java2 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=0;i<n;i++){
			for(int j =0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++){
				System.out.print("*");
					
				}
			System.out.println();
			}
			System.out.println();
		}
	}


	


