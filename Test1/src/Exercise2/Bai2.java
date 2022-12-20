package Exercise2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mức tiêu thụ điện: ");
        int consumption = input.nextInt();
        if (consumption >= 0 && consumption < 25)
            System.out.println("Số tiền điện phải trả là " + consumption*1000 + "đ");
        else if (consumption >= 25 && consumption < 75)
            System.out.println("Số tiền điện phải trả là " + consumption*1250 + "đ");
        if (consumption >= 75 && consumption < 150)
            System.out.println("Số tiền điện phải trả là " + consumption*1800 + "đ");
        if (consumption >= 150)
            System.out.println("Số tiền điện phải trả là " + consumption*2500 + "đ");
    }
}
