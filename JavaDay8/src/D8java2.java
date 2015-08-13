import java.util.Scanner;
public class D8java2 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("請輸入有幾位學生!");
		int n =scn.nextInt();
		int a=0;
		int i=0,j=0;
		int min=100,max=0;
		float data[][]= new float[n][4];
		String name[] = new String[n];
		
		for(i=0;i<n;i++){
			System.out.println("請輸入第"+(i+1)+"位同學的名字");
			name[i] = scn.next();
			System.out.println("請輸入三科成績");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0]+data[i][1]+data[i][2])/3;//個人平均
			}	
		for(i=0;i<n;i++){
			for(j = i+1;j<n;j++){
				if(data[i][3]>data[j][3]){
					float v1=data[i][3];
					data[i][3]=data[j][3];
					data[j][3]=v1;
					String v2= name[i];
					name[i]=name[j];
					name[j]=v2;
				}
			}
		}
		System.out.println("全班資料如下");
		for(i=0;i<n;i++){
			for(i=0;i<n;i++){
				System.out.println(name[i]+":"+data[i][3]);	
			}
			
		System.out.println("不及格的學生共有:");
		for( i=0;i<n;i++){
			if(data[i][3]<60){
				a++;
			}
			}
		System.out.println(+a);
		
		for(i=0;i<n;i++){
			if(data[i][3]<min){
		    	min=(int) data[i][3];
		    }
		    if(data[i][3]>max){
		    	max=(int) data[i][3];
			}
		}
		    System.out.println("分數最低是"+min);
			System.out.println("分數最高是"+max);
	
		
	
	}
	}
}
