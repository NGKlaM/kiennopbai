import java.util.Scanner;

public class baitap {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so : ");
            int num = scanner.nextInt();
            System.out.println(soNguyenTo(num));
        }
    }
    public static String soNguyenTo (int num){
        if(num >1){
            int dem =1;
            for (int i = 1 ;num>i;i++){
                if(Check(i)){
                    dem++ ;
                }
            }
            return"Số"+ num +"có"+ dem + "số nguyên tố đứng sau nó";
        }else {
            return "Không có số nào đứng sau1";

        }
    }
    public static boolean Check(int i) {
        for (int j = 2; i > j; j++) {
            if (i % j == 0) {
                return false ;

            } else {
                return true;
            }
        }
        return true ;
    }


}
