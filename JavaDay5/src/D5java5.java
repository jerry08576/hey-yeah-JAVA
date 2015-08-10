import java.util.Scanner;
public class D5java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int y = scn.nextInt(); 
		while(y%4!=0||y%100==0 && y%400!=0){
		 y=scn.nextInt();
		}
		System.out.println(y+"¦¹¬°¶|¦~");

	}

}
