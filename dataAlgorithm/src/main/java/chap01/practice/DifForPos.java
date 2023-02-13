package chap01.practice;

import java.util.Scanner;

public class DifForPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값: ");
        int a = stdIn.nextInt();

        int b;
        do {
            System.out.println("a보다 큰 값을 입력해주세요.");
            System.out.println("b의 값: ");
            b = stdIn.nextInt();
        } while (b <= a);
        System.out.println("a와 b의 차이는 " + (b-a) + "입니다.");
    }
}
