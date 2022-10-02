package BaicuaLam;

import java.util.Scanner;

public class VEtamgiac {
        public static void main(String[] args) {
            while (true){
                System.out.println("Mời bạn nhập số nguyên dương n bất kỳ để vẽ tam giác: ");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println("Tam giác là: ");
                for (int i = n - 1; i >= 0; i--){
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
            }
        }
    }

