package chapter2.ch07;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);
        System.out.println("ch1 = " + (int)ch1);

        char ch2 = 66;
        System.out.println( ch2);
//        System.out.println((int)ch1);

        char ch3 = '한';
        char ch4 = '\uD55C';
        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);
    }
}
