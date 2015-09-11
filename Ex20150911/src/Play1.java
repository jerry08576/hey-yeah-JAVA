import java.util.Scanner;

public class Play1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字(介於0~9)");
		long n = scn.nextLong();
		fun1(n);
	}

	public static void fun1(long v1) {
		String s = "" + v1;
		int len = s.length();
		char[] a = s.toCharArray();
		for (int i = 0; i < len; i++) {
			System.out.print("" + a[i] + " ");
		}

	}
}