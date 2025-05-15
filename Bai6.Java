import java.util.Scanner;

public class Bai6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên âm hoặc dương");
        int N = scanner.nextInt();

//        Nếu N âm dổi thành dương
        if (N <= 0){
            N = -N;
        }

        int total = 0;
        while (N > 0){
            int number = N % 10; // lấy phần dư chia cho 10
            total += number; // cộng số vào total
            N = N / 10; // loại số cuối
        }
        System.out.println("Tổng các chữ số là: " + total);
    }
}
