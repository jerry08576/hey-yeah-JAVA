import java.util.Scanner;
public class D10java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T�Ӽ�");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		System.out.println("�̤j������"+gcd(x, y,z));
		}
	public static int gcd(int x,int y,int z){
		if(y == 0 && z == 0){
			return x;
		}else{
			return gcd(y,x%y,z%y);
		}
		
	}
	

		
	}


