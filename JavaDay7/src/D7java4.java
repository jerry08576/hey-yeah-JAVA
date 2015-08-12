import java.util.Random;
import java.util.Scanner;
public class D7java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
		int[]data = new int[5];
		int[]data1 = new int[5];
		int i=0,j=0,c=0;
		System.out.println("請輸入五個不重複數字!");
		for(c=0;c<5;c++){
			data1[c]=scn.nextInt();
	}
		for(c=0;c<5;c++){
			for(j=c+1;j<5;j++){
				if(data1[c]>data1[j]){
					int v1=data1[c];
					data1[c]=data1[j];
					data1[j]=v1;
				}
			}
		}
     	
		
		
		System.out.println("中位數為"+data1[c=2]);
	
		boolean flag=false;
		while(i<5){
			data[i]=rnd.nextInt(100)+1;
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
			System.out.println(data[i]);

		}
		
		System.out.println("中位數為"+data[i=2]);
		if(data1[c]>data[i]){
			System.out.println("贏了!");
		}else if(data1[c]<data[i]){
			System.out.println("輸了!");
		}
		else{
			System.out.println("平手!!");
		}


	}
}