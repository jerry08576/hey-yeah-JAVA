import java.util.Scanner;
public class D10java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@���");
		int n = scn.nextInt();
		System.out.println("�`�X��"+fun(n));
	}
	public static int fun(int n){
		int j=0;
		for(int i=1;i<=n;i++){
			double k=Math.pow(2, i);
			j+=k;
		}
		return j;
	}

}
