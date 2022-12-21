package Exercise1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập các hệ số a,b,c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta = b*b - 4*a*c;
        System.out.println("Delta = " + delta + " , Căn bậc 2 của Delta = " + Math.sqrt(delta));
    }
}
