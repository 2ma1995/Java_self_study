package chapter2.test;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
//    다이아몬드출력 (입력받아서 출력)
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        int spaceCount = lineCount / 2 + 1;
        int startCount = 1;
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < startCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            if (i<lineCount/2){
                spaceCount-=1;
                startCount+=2;
            }
            else {
                spaceCount+=1;
                startCount-=2;
            }
            System.out.println("");
        }
    }
}
