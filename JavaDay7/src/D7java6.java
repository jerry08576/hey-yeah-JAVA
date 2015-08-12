import java.util.Scanner;
public class D7java6 {
	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn = new Scanner(System.in);
		int m = scn.nextInt();
		int sum=1;
		int i = 1;	
			while( i<=m){
				sum*=i;
				i++;
			
		}
			System.out.println("sum="+sum);

	}

}
