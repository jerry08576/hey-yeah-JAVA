import java.util.Random;
public class D6java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		float[]data = new float[10];
		int i=0;
		boolean flag=false;
		while(i<10){
			data[i]=rnd.nextInt(100)+1;
			flag=false;
			
			for(int j=0;j<i;j++){
				if(data[i] == data[j]){
					flag=true;
				}
			}
			if(flag==false){
				i++;
			}
		}
		for(i=0;i<10;i++){
			System.out.println(data[i]);
			}
		

	}

}
