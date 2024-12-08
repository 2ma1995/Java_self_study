package chapter2.ch13;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
//        예제1
//        int age;
//        System.out.println("나이를 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//        age = scanner.nextInt();
//
//        if (age >= 8) {
//            System.out.println("학교에갑니다");
//        } else {
//            System.out.println("학교에 가지 않습니다");
//        }

//        예제2
        int age;
        int charge;
        System.out.println("나이를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다");
        } else if(age<14){
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if(age<20){
            charge = 2500;
            System.out.println("중, 고등학생입니다");
        }else {
            charge = 3000;
            System.out.println("일반인입니다");
        }
        System.out.println("입장료는 "+ charge + "원 입니다.");

    }
}
