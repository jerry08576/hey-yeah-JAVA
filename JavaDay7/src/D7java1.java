import java.util.Scanner;
public class D7java1 {

	private static Scanner scn;
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤å¦r!");
		String str=scn.nextLine();
		char[] data = str.toCharArray();
		int len=data.length;
		char[]data1 = new char[len];
		for(int i=0;i<len;i++){
			data1[i] = data[len-i-1];
		}
		new String(data1);
		System.out.println(data1);

	}

}
