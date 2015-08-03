import java.util.Scanner;
public class Happyjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.println("Hi 請問您是");
		   String name = scn.next();          
           System.out.println("Hi,"+name+"您好");
           System.out.println(""+name+",很高興認識你,請問您是哪所高中畢業的");
           String school = scn.next();
           System.out.println(""+name+",原來你是"+school+"畢業的");
           System.out.println("你現在讀哪一個系的?");
           String department = scn.next();
           System.out.println("哇~~"+department+"可是熱門科系誒,你實在是太厲害了!:)");
           System.out.println("你畢業後要從事甚麼工作?");
           String work = scn.next();
           System.out.println(""+work+"是個不錯的工作,真是羨慕你!:)");
           
          
          
           
          
          
           
           
           
	}

}
