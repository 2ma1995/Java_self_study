package chapter5.ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전을합니다");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void fuel() {

    }
    public void washCar(){
        System.out.println("손세차를 합니다.");
    }
}
