package chapter3.ch03;

public class FunctionTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
       int total =addNum(30,20);
        System.out.println("total = " + total);

//        sayHello호출 (반환값은 없고, 매개변수있는 함수)
    sayHello("yo");

//        (반환값은 있고, 매개변수없는 함수)
    int sum =calcSum();
        System.out.println(sum);
    }

    public static int addNum(int num1, int num2){
        return num1+num2;
    }
    public static void sayHello(String str){
        System.out.println(str);
    }
    public static int calcSum(){
        int i;
        int sum = 0;
        for ( i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }


}
