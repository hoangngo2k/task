package Exercise2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mức tiêu thụ điện: ");
        int consumption = input.nextInt();
        if (consumption >= 0 && consumption < 25) {
            System.out.println("Số tiền điện phải trả là " + consumption*1000 + "đ");
        } else if (consumption >= 25 && consumption < 75) {
            System.out.println("Số tiền điện phải trả là " + (25 * 1000 + (consumption - 25) * 1250) + "đ");
        } else if (consumption >= 75 && consumption < 150) {
            System.out.println("Số tiền điện phải trả là " + (25 * 1000 + (consumption - 25 - 75) * 1800 + 75 * 1250) + "đ");
        } else
            System.out.println("Số tiền điện phải trả là " + (25*1000 + (consumption-25-75-150)*2500 + 75*1250 + 150*1800) + "đ");
    }
}
