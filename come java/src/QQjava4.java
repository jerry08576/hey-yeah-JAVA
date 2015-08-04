import java.util.Scanner;
public class QQjava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入車子的傾角，兩軸軸心之軸距及輪胎尺寸");
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		if(A>43 && B>130 && C==12){
			System.out.println("這就是你要的車!!!");
			
		}else{
			System.out.println("別牽這台車，你會摔車!");
		}

	}

}
