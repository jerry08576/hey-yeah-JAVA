import java.util.Scanner;
public class D9java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��Ʀr(����0~9)");
		long n = scn.nextLong();
		int c=(int)(fun1(n));
		System.out.println("���G��"+c);
	}
	public static long fun1(long v1){
		long result = 0;
		String s=""+v1;
		int len = s.length();
		char[] a = s.toCharArray();
		for(int i=0;i<len;i++){
			int d=a[i]-'0';
			result+=d;
		}
		return result;
	}
}
