import java.util.Random;
public class D11java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		System.out.println(fun(b));
		
	}	
		public static int fun(int b){
			Random rnd = new Random();
			int a=1000-rnd.nextInt(1000);
			int n1[]={500,100,50,10,5,1};
			int n2[]=new int[6];
			System.out.println(a);
			for(int i=0;i<n1.length;i++){
				n2[i]=a/n1[i];
				a = a%n1[i];
				System.out.println(n2[i]+"­Ó"+n1[i]);
			
			}
		
			return b;	
		}
		
		
		

	

}
