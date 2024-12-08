package chapter2.ch03;

public class BinaryTest {
    public static void main(String[] args) {

        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;
        System.out.println("num = " + num);
        System.out.println("bNum = " + bNum);
        System.out.println("oNum = " + oNum);
        System.out.println("xNum = " + xNum);

        int cNum = 0b01000001;//65
        System.out.println("cNum = " + (char)cNum);
    }
}
