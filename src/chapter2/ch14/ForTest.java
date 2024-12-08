package chapter2.ch14;

public class ForTest {
    public static void main(String[] args) {
        int num =1;
        int sum = 0;
//        while (num<=10){
//            sum +=num;
//            num++;
//        }
//        System.out.println(sum);


//        초기화는 여러개 할수있음
        for (num = 1, sum = 0; num <= 10; num++) {
            System.out.println(num+"번째 출력입니다.");
            sum+=num;
        }

    }
}
