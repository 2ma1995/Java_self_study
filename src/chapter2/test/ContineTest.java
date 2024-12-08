package chapter2.test;

public class ContineTest {
    public static void main(String[] args) {
//        구구단 짝수단만 출력 *(continue문사용)
        for (int i = 2; i < 10; i++) {
            if (i % 2 != 0) continue;
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("");
        }
    }
}
