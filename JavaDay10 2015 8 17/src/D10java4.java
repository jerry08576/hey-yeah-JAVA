import java.util.Scanner;
public class D10java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��Ӽ�");
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("�̤j������"+gcd(x, y));
		}
	public static int gcd(int x,int y){
		if(y == 0){
			return x;
		}else{
			return gcd(y,x%y);
		}
		
	}
	

		
	}


