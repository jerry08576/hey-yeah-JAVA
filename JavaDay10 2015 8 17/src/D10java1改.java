import java.util.Random;
public class D10java1зя {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a=1000-rnd.nextInt(1000);
		System.out.println(a);
			int n1[]={500,100,50,10,5,1};
			int n2[]=new int[6];
			for(int i=0;i<n1.length;i++){
				n2[i]=a/n1[i];
				a = a%n1[i];
				if(n2[i]>0){
					System.out.println(n2[i]+"н╙"+n1[i]);
				}
				
			}
		
		}		
		

	

}
