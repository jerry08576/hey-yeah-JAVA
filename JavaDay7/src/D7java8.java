import java.util.Random;
import java.util.Scanner;
public class D7java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rad = new Random();
	
		int i =0,max=0 ,min=9999;
		int[]data = new int[3];	
				boolean flag=false;
				while(i<3){
					for(i=0;i<3;i++){
				    data[i]=rad.nextInt(100)+1;
				    if(data[i]<min){
				    	min=data[i];
				    }
				    if(data[i]>max){
				    	max=data[i];
					}
					flag=false;
					
					for(int j=0;j<3;j++){
						if(data[i] == data[j]){
							flag=true;
						}
					}
					if(flag==false){
						i++;
					}
				}
			for(i=0;i<3;i++){
				System.out.println(data[i]);
		}
			System.out.println("min is"+min);
			System.out.println("max is"+max);
			
				}
	}
		}

        

