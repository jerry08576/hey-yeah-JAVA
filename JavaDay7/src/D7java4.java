import java.util.Random;
import java.util.Scanner;
public class D7java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入五個不重複數字!");
		int m=scn.nextInt();
		int[]data = new int[5];
		int i=0,j=0;
		boolean flag=false;
		while(i<5){
			data[i]=rnd.nextInt(100);
			flag=false;
			for( j=0;j<i;j++){
				if(data[i] == data[j]){
					flag=true;
				}
			}
			if(flag==false){
				i++;
			}
		}
		for(i=0;i<5;i++){
			for(j=i+1;j<5;j++){
				if(data[i]>data[j]){
					int v1=data[i];
					data[i]=data[j];
					data[j]=v1;
				}
			}
		}
		for(i=0;i<5;i++){
			System.out.println(data[i]);
			}
	}
}