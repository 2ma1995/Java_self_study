package chapter2.ch13;

import java.util.Scanner;

public class SwitchCaseTest2 {
    public static void main(String[] args) {
        String medal = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력해주세요.");
        medal = scanner.nextLine();
        switch (medal){
            case "gold" :
                System.out.println("금메달입니다.");
                break;
            case "silver" :
                System.out.println("은메달입니다.");
                break;
            case "bronze" :
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이없습니다...");
                break;
        }
        }
}
