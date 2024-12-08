package chapter2.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
//        grade = (score>=90)? 'A' : 'B'; => if문으로 변형
        Scanner scanner = new Scanner(System.in);
        String grade = "";
        int score;
        System.out.println("점수를 입력하세요.");
        score = scanner.nextInt();
        if (score >= 90) {
           grade = "A";
        } else  if (score < 90){
            grade = "B";
        }
        System.out.println(grade);
    }
}
