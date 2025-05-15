import java.util.Scanner;

public class Bai4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (true){
            System.out.println("Nhập tuổi của bạn: ");

//            Ktra ng dùng có nhập số nguyên k
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

//                Ktra tuổi > 0 k
                if (age > 0){
                    break; // thoát vòng lặp nếu nhập đúng
                }else {
                    System.out.println("Vui lòng nhập vào 1 số nguyên và lớn hơn 0: ");
                }
            }else {
                System.out.println("Vui lòng nhập vào 1 số nguyên và lớn hơn 0: ");
                scanner.next(); // bỏ giá trị sai
            }
        }
        System.out.println("Tuổi của bạn là: " + age + ".");
        
    }
}
