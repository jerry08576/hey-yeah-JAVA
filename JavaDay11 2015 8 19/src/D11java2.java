import java.util.Random;
public class D11java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  b=0;
		System.out.println(fun(b));
	}
		public static int fun(int b){
			Random rnd = new Random();
			int[]data = new int[1];
			int i=0;
			data[i]=1000-rnd.nextInt(1000);	
			
			for(i=0;i<1;i++){
				int v1 = data[i]/1000;
				data[i] = data[i]%1000;
				int v2 = data[i]/100;
				data[i] = data[i]%100;
				int v3 = data[i]/10;
				data[i] = data[i]%10;
				int v4 = data[i]/1;
				data[i] = data[i]%1;
				
			    System.out.println(v1+"千"+v2+"百"+v3+"十"+v4+"元");
			}
			return  b;
		}
		
		
	

}
