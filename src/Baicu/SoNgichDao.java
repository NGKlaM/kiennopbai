package Baicu;

import java.util.Scanner;

public class SoNgichDao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int so,ND,bandau=0;
        System.out.println("nhap so");
        so=scanner.nextInt();
        ND = so;
        for (; so != 0; so /= 10) {
            int phandu = so % 10;
            bandau = bandau * 10 + phandu;
        }
        System.out.println(so == bandau ? "Số " + so + " là số ngược đảo " : "Số " + so +
                " không phải là số ngược đảo ");
    }
}

