import java.util.Scanner;
public class D8java3 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("請輸入矩陣幾列幾行");
		int p=0,q=0;
		int r =scn.nextInt();
		int s =scn.nextInt();
		int t =scn.nextInt();
		int[][] a = new int[r][s];
        int[][] b = new int[s][t];
        int[][] c = new int[r][t];
        System.out.println("請輸入4碼");
        for (int i = 0;i< s; i++) {
            for (int j = 0; j <t; j++) {
            	a[i][j]=scn.nextInt();
            }
        }
        System.out.println("請輸入4碼");
        for (int j = 0; j <t; j++){
                for (int k = 0; k < r; k++) {
                	b[j][k]= scn.nextInt();
                }
          	}
        for(int i=0;i<r;i++){
        	for (int k = 0; k < r; k++){
        		for (int j = 0; j <t; j++){
        			c[p][q]+=a[i][j]*b[j][k];
        		}
        		q++;
        	}
        	p++;q=0;
        }
         System.out.println("a(如下):");
        for (int i = 0;i<s; i++) {
            for (int j = 0; j <t; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("b(如下):");
        for (int j = 0; j<t; j++) {
            for (int k = 0; k < r; k++) {
                System.out.print(b[j][k] + "\t");
            }
            System.out.println();
        }
        System.out.println("c=a*b(如下):");
        for (int k = 0;k<r; k++) {
            for (int j = 0; j < t; j++) {
                System.out.print(c[k][j] + "\t");
            }
            System.out.println();
        }
    }
}
