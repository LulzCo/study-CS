package chap01.practice;

public class Median {
    static int med(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else {
                if (a < c) {
                    return a;
                } else {
                    return c;
                }
            }
        } else {
            if (a >= c) {
                return a;
            } else if (c < b) {
                return c;
            } else {
                return b;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(med(1,2,3));
    }
}
