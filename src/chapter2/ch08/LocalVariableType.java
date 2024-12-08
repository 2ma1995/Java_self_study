package chapter2.ch08;

public class LocalVariableType {
    public static void main(String[] args) {

        var i = 10;
        var j =10.0;
        var str = "hello";
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("str = " + str);
        str = "test";
        System.out.println("str = " + str);
    }
}
