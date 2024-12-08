//package chapter2.ch13;
//
//import java.util.Scanner;
//
//public class SwitchCaseTest3 {
////    버전 java14이상부터 사용가능한 switch 문
//    public static void main(String[] args) {
//        int month;
//        Scanner scanner = new Scanner(System.in);
//        month = scanner.nextInt();
//
//        int day = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> {
//                yield 31;
//
//            }
//            case 2 -> {
//                yield 28;
//            }
//            case 4, 6, 9, 11 -> {
//                yield 30;
//            }
//            default -> {
//                System.out.println("error");
//                yield 0;
//            }
//        };
//        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
//    }
//}
