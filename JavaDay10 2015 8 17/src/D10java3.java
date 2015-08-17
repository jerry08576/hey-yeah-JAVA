import java.util.Scanner;
public class D10java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數值");
		long c = scn.nextLong();
		System.out.println(fun(c)+"位數");
	}
	public static long fun(long n){
		if(n<10 && n>0){
			return 1;
		}else{
			return 1+fun(n/10);
		
		}
		
	}
	
}

