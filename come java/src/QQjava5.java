import java.util.Scanner;
public class QQjava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���");
		float A = scn.nextFloat();
		System.out.println("�п�J���");
		float B = scn.nextFloat();
		if((A == 1 && B<=20 && B>=1) || (A == 12 && B<=21 && B>=31) ){
			System.out.println("���~�y");
		}else if(A == 1 && B>21 || A == 2 && B<=19 && B>0){
			System.out.println("���~�y");
		}
		
		if(A == 2 && B>=20 || A == 3 && B<=20 && B>0 ){
			System.out.println("�����y");
		}else if(A == 3 && B>=21 || A==4 && B<=19 && B>0){
			System.out.println("�զϮy");
			
		}
		
		if(A == 5 && B<=21 && B>0 || A==6 && B<=21 && B>0){
			System.out.println("���l�y");
		}else if(A == 6 && B>=22 || A == 7 && B<=22 && B>0) {
			System.out.println("���ɮy");
		}
		
		if(A == 7 && B>=23 || A == 8 && B<=22 && B>0){
			System.out.println("��l�y");
		}else if(A == 8 && B>=23 || A == 9 && B<=22 && B>0){
			System.out.println("Ĳ�k�y");
		}
		if(A == 9 && B>=23 ||A == 10 && B<=23 && B>0){
			System.out.println("�ѯ��y");
		}else if(A == 10 && B>=24 || A == 11 && B<=21 && B>0){
			System.out.println("���Ȯy");
		}
		if(A == 11 && B>=22 || A == 12 && B<20 && B>0){
			System.out.println("�g��y");
		}else if(A == 12 && B>=21 || A == 1 && B<=20 && B>0){
			System.out.println("�]�~�y");
		}
		
		

	}

}
