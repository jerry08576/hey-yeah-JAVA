import java.util.Scanner;
public class D10java6 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("�п�J����");
		int a = scn.nextInt();
        int b = scn.nextInt();
        int max = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        System.out.println("�̤p�����Ƭ�"+a * b / max);

	}

}