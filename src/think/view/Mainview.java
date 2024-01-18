package think.view;

import java.util.Scanner;

public class Mainview {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Subview subview = new Subview();
        while (true) {
            System.out.println("1.계좌생성 2.예금 3.출금");
            int ch = scanner.nextInt();

            if (ch == 1) {
                subview.계좌생성();
            }
        }
    }
}
