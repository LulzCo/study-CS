package chap01.practice;

public class Table99 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.printf("   |");
                    } else {
                        System.out.printf("%3d|", i);
                    }
                } else {
                    System.out.printf("%3d", j);
                }
            }
            System.out.println();
            if (i == 0) {
                System.out.println("---+---------------------------");
            }
        }
    }
}
