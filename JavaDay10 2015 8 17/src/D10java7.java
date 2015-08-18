import java.util.Scanner;

public class D10java7 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("叫块俱计");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println("程そ计" + lcm(a, b,c));
	}
	 public static int gcd(int a,int b,int c){
  	   if(b==0){
  		   return a;
  	   }
  	   if(c == 0){
  		   return gcd(b,a%b,0);
  	   }
  	   else{
  		   return gcd(a,c,b%c);
  	   }
	 }
	 public static int lcm(int a,int b,int c){
		 int q=a*b/gcd(a,b,0); // q琌(a,b)程そ计 
		 return q*c/gcd(q,c,0);//计程そ计
	   }

  		 
  	 }

	 

