import java.util.Scanner;
public class QQjava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner(System.in);
		   System.out.println("請問你要追的女生身高和體重多少?");
		   float A=scn.nextFloat();
		   float B=scn.nextFloat();
		   if(A>=165&&B<=45){
			   System.out.println("恭喜你!去追她!!");
			   
			  }else{
				  System.out.println("千萬別去@@");
		   }

	}

}
