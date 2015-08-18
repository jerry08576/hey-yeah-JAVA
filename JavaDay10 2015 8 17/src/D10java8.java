import java.util.Scanner;
public class D10java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一整數");
		int a = scn.nextInt();
		int b=a*(a+1);
		System.out.println(fac(a,b));
	}	
		public static int fac(int a,int b){
			if(a==0){
				return b;	
			}else{
				return fac(a-1,b+a*(a-1));
			}
		}
	
	}
