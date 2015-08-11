import java.util.Scanner;
import java.util.Random;

public class D6java1 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		Random rad = new Random();
		int count=0;
		
		float[]data = new float[10];
		for(int i=0;i<10;i++){
			data[i]=rad.nextInt(100);
			if(data[i]%2==0){
				 count++;
			}
			
			
			}
		int j=0;
		while(j<3){
			System.out.println("猜猜看有幾個偶數!");
			int k = scn.nextInt();
			if(k==count){
				System.out.println("got it!");
				j=3;
			}else{
				System.out.println("再試試吧!!");
				j++;
			}
			
		
		}
		for(int i=0;i<10;i++){
			System.out.println(data[i]);
			}
		
				
				

	}

}