import java.util.Scanner;
public class D7java5 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int m = scn.nextInt();
		int sum=1;
		for(int i=1;i<=m;i++){
			sum*=i;
		}
		System.out.println("sum="+sum);

	}

}
