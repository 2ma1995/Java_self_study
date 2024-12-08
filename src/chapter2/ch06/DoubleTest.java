package chapter2.ch06;

public class DoubleTest {
    public static void main(String[] args) {

        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println("dnum = " + dnum);
        System.out.println("fnum = " + fnum);

        double mynum = 1;
        for (int i = 0; i < 10000; i++) {
            mynum= mynum+0.1;
        }
        System.out.println("mynum = " + mynum);

    }
}
