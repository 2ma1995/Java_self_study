package chapter2.ch12;

public class BitTest {
    public static void main(String[] args) {

        int num1 = 5; // 00000101
        int num2 = 10; //00001010
        System.out.println(num1|num2); //00001111
        System.out.println(num1&num2); //00000000
        System.out.println(num1^num2); //00001111

        System.out.println(num1<<2); //00010100
        System.out.println(num1);  // 00000101
        System.out.println(num1<<=2); //00010100
        System.out.println(num1); //00010100

    }
}
