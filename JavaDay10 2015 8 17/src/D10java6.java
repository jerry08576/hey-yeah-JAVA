import java.util.Scanner;
public class D10java6 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("請輸入兩整數");
		int a = scn.nextInt();
        int b = scn.nextInt();
        int max = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        System.out.println("最小公倍數為"+a * b / max);

	}

}