package chapter3.ch16;

public class School {

//  하나는 만들어야 하기때문에, 내부에 하나 만듬.( instance로 객체를 만듬)
    private static School instance = new School();

//    싱글톤패턴(컨스트럭터 하나만 사용) private으로 외부에서 못만들게 설정.
    private School(){}

//  외부에서 사용할수 있게끔, 설정
    public static School getInstance(){
        if (instance==null){
            instance = new School();
        }
        return instance;
    }
}
