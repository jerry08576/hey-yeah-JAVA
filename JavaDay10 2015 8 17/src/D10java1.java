import java.util.Random;
public class D10java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[]data = new int[1];
		int i=0;
		for(i=0;i<1;i++){
			data[i]=rnd.nextInt(1000)+1;
			System.out.println(data[i]);
				int v1 = data[i]/500;
				data[i] = data[i]%500;
				if(v1!=0){
					System.out.println("共有"+v1+"個500元");
				}
				int v2 = data[i]/100;
				data[i] = data[i]%100;
				if(v2!=0){
					System.out.println("共有"+v2+"個100元");
				}
				int v3 = data[i]/50;
				data[i] = data[i]%50;
				if(v3!=0){
					System.out.println("共有"+v3+"個50元"); 
				}
				int v4 = data[i]/10;
				data[i] = data[i]%10;
				if(v4!=0){
					System.out.println("共有"+v4+"個10元");
				}
				int v5 = data[i]/5;
				data[i] = data[i]%5;
				if(v5!=0){
					System.out.println("共有"+v5+"個5元");
				}
			
				int v6 = data[i]/1;
				data[i] = data[i]%1;
				if(v6!=0){
					System.out.println("共有"+v6+"個1元");	
				}
				
				
								 
				 
				
			}
			
		}
		
	}



