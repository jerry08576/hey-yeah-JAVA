import java.util.Scanner;
public class D10java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@����ƭ�");
		long c = scn.nextLong();
		System.out.println(fun(c)+"���");
	}
	public static long fun(long n){
		if(n<10 && n>0){
			return 1;
		}else{
			return 1+fun(n/10);
		
		}
		
	}
	
}

