import java.util.Random;
public class D7java2 {

	public static void main(String[] args) {
		Random rad = new Random();
		int i=0;
		int a=0,b=0,c=0;
		float[]data = new float[20];
		for(i=0;i<20;i++){
			data[i]=rad.nextInt(20)-10;
			if(data[i]>0){
				a++;
				}else if(data[i]<0){
					b++;
				}
				else{
					c++;
				}
		}
	
		for( i=0;i<20;i++){
			System.out.println(data[i]);
			}
		System.out.println("共有"+a+"個正值和"+b+"個負值和"+c+"個0");
	}

}
