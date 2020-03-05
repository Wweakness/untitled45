import java.util.Arrays;
//  前三个数 球心左边  后三个数 球上一点坐标
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a1=in.nextInt();
            int a2=in.nextInt();
            int a3=in.nextInt();
            int b1=in.nextInt();
            int b2=in.nextInt();
            int b3=in.nextInt();
           double banjin=  Math.sqrt((b1-a1)*(b1-a1)+(b2-a2)*(b2-a2)+(b3-a3)*(b3-a3)  );
            double tiji=Math.PI*banjin*banjin*banjin*4/3;
            System.out.printf("%.3f",banjin);
            System.out.print(" ");
            System.out.printf("%.3f\n",tiji);
        }
    }
}