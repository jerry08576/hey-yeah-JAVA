import java.util.Scanner;
public class QQjava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A值:");
		float A=scn.nextFloat();
		System.out.println("請輸入B值:");
		float B=scn.nextFloat();
		System.out.println("你要做的運算是+，-，*，/");
		String str=scn.next();
		if(str.equals("+")){
			System.out.println(""+(A+B)+"="+A+"+"+B);
		}else{
			if(str.equals("-")){
				System.out.println(""+(A-B)+"="+A+"-"+B);
			}else{
				if(str.equals("*")){
					System.out.println(""+(A*B)+"="+A+"*"+B);
				}else{
					if(str.equals("/")){
						System.out.println(""+(A/B)+"="+A+"/"+B);
					}
				}
			}
		}

	}
}
