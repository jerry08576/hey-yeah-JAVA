import java.util.Scanner;
public class D8java3 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("�п�J�x�}�X�C�X��");
		int p=0,q=0;
		int r =scn.nextInt();
		int s =scn.nextInt();
		int t =scn.nextInt();
		int[][] a = new int[r][s];
        int[][] b = new int[s][t];
        int[][] c = new int[r][t];
        System.out.println("�п�J4�X");
        for (int i = 0;i< s; i++) {
            for (int j = 0; j <t; j++) {
            	a[i][j]=scn.nextInt();
            }
        }
        System.out.println("�п�J4�X");
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
         System.out.println("a(�p�U):");
        for (int i = 0;i<s; i++) {
            for (int j = 0; j <t; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("b(�p�U):");
        for (int j = 0; j<t; j++) {
            for (int k = 0; k < r; k++) {
                System.out.print(b[j][k] + "\t");
            }
            System.out.println();
        }
        System.out.println("c=a*b(�p�U):");
        for (int k = 0;k<r; k++) {
            for (int j = 0; j < t; j++) {
                System.out.print(c[k][j] + "\t");
            }
            System.out.println();
        }
    }
}
