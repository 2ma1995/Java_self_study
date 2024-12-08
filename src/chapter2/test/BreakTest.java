package chapter2.test;

public class BreakTest {
    public static void main(String[] args) {
//        구구단 곱하는수가 작거나 같을때까지만 출력 *(break문사용)
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > i)
                    break;
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("");
        }
    }
}
