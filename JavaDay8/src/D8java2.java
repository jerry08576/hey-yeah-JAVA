import java.util.Scanner;
public class D8java2 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("�п�J���X��ǥ�!");
		int n =scn.nextInt();
		int a=0;
		int i=0,j=0;
		int min=100,max=0;
		float data[][]= new float[n][4];
		String name[] = new String[n];
		
		for(i=0;i<n;i++){
			System.out.println("�п�J��"+(i+1)+"��P�Ǫ��W�r");
			name[i] = scn.next();
			System.out.println("�п�J�T�즨�Z");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0]+data[i][1]+data[i][2])/3;//�ӤH����
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
		System.out.println("���Z��Ʀp�U");
		for(i=0;i<n;i++){
			for(i=0;i<n;i++){
				System.out.println(name[i]+":"+data[i][3]);	
			}
			
		System.out.println("���ή檺�ǥͦ@��:");
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
		    System.out.println("���Ƴ̧C�O"+min);
			System.out.println("���Ƴ̰��O"+max);
	
		
	
	}
	}
}
