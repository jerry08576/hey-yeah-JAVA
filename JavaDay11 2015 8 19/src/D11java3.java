import java.util.Scanner;
public class D11java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤@¦ê¦r");
		String str = scn.nextLine();
		String n = null;
		System.out.println(fun(str));
	}
	    public static String fun(String n){
	    	int n1=n.length();
	    	String string="";
	    	char a[]=n.toCharArray();
	    	for(int i=0;i<n1;i++){
	    		if(a[i]!=' '){
	    			string+=a[i];
	    		}
	    	}
	    	
		return string;
		
	}

}
