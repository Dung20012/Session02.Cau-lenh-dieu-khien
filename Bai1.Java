import java.util.Scanner;

public class Bai1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên:");
        int n = scanner.nextInt();

//        ktra hiển thị kq
        if (n == 0){
            System.out.println("Số k phải chẵn cũng k phải lẻ");
        } else if (n % 2 == 0) {
            System.out.println("Số" + n + "là số chẵn");
        }else {
            System.out.println("Số" + n + "là số lẻ");
        }
    }
}
