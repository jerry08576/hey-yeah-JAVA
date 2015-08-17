import java.util.Random;
public class D10java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int[]data = new int[1];
		int i=0;
		for(i=0;i<1;i++){
			data[i]=rnd.nextInt(1000)+1;
			System.out.println(data[i]);
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

	}

}
