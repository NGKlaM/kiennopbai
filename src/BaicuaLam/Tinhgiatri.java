package BaicuaLam;
import java.util.Scanner;
public class Tinhgiatri {
    public static void main(String[] args) {
//        3A=1.2.3 + 2.3.3 + 3.4.3 +... + n.(n+1).3
//
//        = 1.2.(3-0) + 2.3.(4-1) + ... + n.(n+1).[(n+2)-(n-1)]
//
//        = [1.2.3+ 2.3.4 + ...+ (n-1).n.(n+1)+ n.(n+1)(n+2)] - [0.1.2+ 1.2.3 +...+(n-1).n.(n+1)]
//
//        = n.(n+1).(n+2)
//
//        =>S=[n.(n+1).(n+2)] /3
                while (true){
                    System.out.println("Nhap so: ");
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int S = 0;
                    for (int i = 1 ; i <= n ; i++){
                        S += i*(i+1);
                    }
                    System.out.println("Tổng S = " + S);
                }
            }
        }

