import java.util.Scanner;
public class D10java6�� {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("�п�J����");
		int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("�̤p�����Ƭ�"+lcm(a,b));
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

    	   
       
	



