import java.util.Scanner;
public class D9java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("n=?");
		int n = scn.nextInt();
		int c=(int)(fun1(n)*(fun1(n)+1));
		System.out.println("n*(n+1)="+c);
		fun2(n);
		}
	public static long fun1(int v1){
		long result = 1;
		for(int i=1;i<=v1;i++){
			result=i;
		}
		return result;
	}
	public static void fun2(int v1){
		System.out.println("Result 2 ==>n*(n+1)="+(fun1(v1)*(fun1(v1)+1)));
	}



}
