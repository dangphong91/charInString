import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        String name = "Pham Dang Phong";
        System.out.println("Chuỗi cần kiểm tra : " + name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kí tự muốn kiểm tra:");
        char x = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i<name.length(); i++) {
            if (name.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("Số lượng kí tự " + x + " xuất hiện trong chuỗi là: " + count);
    }
}
