import java.util.Scanner;

public class Happyjava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 System.out.println("請輸入梯形的上底，下底和高");
		 float a=scn.nextFloat();
		 float b=scn.nextFloat();
		 float c=scn.nextFloat();
		 float t=(a+b)*c/2;
		 System.out.println("梯形面積為"+t);
		 

	}

}
