import java.util.Scanner;
public class D7java3 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int i=0;
		System.out.println("請輸入加密內容");
		String str=scn.nextLine();
		System.out.println("請輸入金鑰");
		int key=scn.nextInt() ;
		char[] data = str.toCharArray();
		int len=str.length();
		for( i=0;i<len;i++){
		data[i]=(char) (data[i]+key);
		}
		String newStr=new String(data);
		System.out.println(newStr);
		System.out.println("是否解密(y/n)");
		String str1=scn.next();
		if(str1.equals("y")){
			for( i=0;i<len;i++){
				data[i]=(char) (data[i]-key);	
		}
			String newStr1=new String(data);
			System.out.print( newStr1);
			
				}
		
		
		}

}
