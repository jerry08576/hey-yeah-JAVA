import java.util.Scanner;

public class Happyjava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 System.out.println("請輸入阿勳買了多少平方公尺");
		 System.out.println("再輸入一坪多少價格");
		 float a=scn.nextFloat();
		 float b=scn.nextFloat();
		 float c=a*0.3025f*b;
		 System.out.println("總價錢為"+c);
		 

	}

}
