import java.util.Scanner;
public class D10java6改 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("請輸入兩整數");
		int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("最小公倍數為"+lcm(a,b));
	}
       public static int gcd(int a,int b){
    	   if(b==0){
    		   return a;
    	   }else{
    		   return gcd(b ,a%b);
    	   }
       }
    	   public static int lcm(int a,int b){
    		   return a*b/gcd(a,b);
    	   }
    	   }

    	   
       
	



