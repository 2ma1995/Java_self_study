package chapter2.ch15;

public class NestedLoopTest {
    public static void main(String[] args) {

        int dan = 2;
        int time = 1;
        for (dan = 2; dan < 10; dan++) {
            for (time = 1; time < 10; time++) {
                System.out.println(dan + "*" + time + "=" + dan * time);
            }
            dan = 2;
            time = 1;
            while (dan <= 9) {
                time=1;
                while (time <= 9) {
                    System.out.println(dan + "*" + time + "=" + dan * time);
                time++;
                }
                dan++;
            }
        }
    }
}
