package chapter5.ch15;

public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void sayHello(){
        System.out.println("say hello");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }
}
