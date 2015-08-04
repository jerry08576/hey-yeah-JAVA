import java.util.Scanner;
public class QQjava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤ë¥÷");
		float A = scn.nextFloat();
		System.out.println("½Ð¿é¤J¤é´Á");
		float B = scn.nextFloat();
		if((A == 1 && B<=20 && B>=1) || (A == 12 && B<=21 && B>=31) ){
			System.out.println("¼¯½~®y");
		}else if(A == 1 && B>21 || A == 2 && B<=19 && B>0){
			System.out.println("¤ô²~®y");
		}
		
		if(A == 2 && B>=20 || A == 3 && B<=20 && B>0 ){
			System.out.println("Âù³½®y");
		}else if(A == 3 && B>=21 || A==4 && B<=19 && B>0){
			System.out.println("¥Õ¦Ï®y");
			
		}
		
		if(A == 5 && B<=21 && B>0 || A==6 && B<=21 && B>0){
			System.out.println("Âù¤l®y");
		}else if(A == 6 && B>=22 || A == 7 && B<=22 && B>0) {
			System.out.println("¥¨ÃÉ®y");
		}
		
		if(A == 7 && B>=23 || A == 8 && B<=22 && B>0){
			System.out.println("·à¤l®y");
		}else if(A == 8 && B>=23 || A == 9 && B<=22 && B>0){
			System.out.println("Ä²¤k®y");
		}
		if(A == 9 && B>=23 ||A == 10 && B<=23 && B>0){
			System.out.println("¤Ñ¯¯®y");
		}else if(A == 10 && B>=24 || A == 11 && B<=21 && B>0){
			System.out.println("¤ÑÃÈ®y");
		}
		if(A == 11 && B>=22 || A == 12 && B<20 && B>0){
			System.out.println("®g¤â®y");
		}else if(A == 12 && B>=21 || A == 1 && B<=20 && B>0){
			System.out.println("Å]½~®y");
		}
		
		

	}

}
