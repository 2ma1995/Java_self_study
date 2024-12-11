package chapter5.ch06;

public class GoldCustomer extends Customer{
    double salesRatio;
    public GoldCustomer(int cutomerId, String cutomerName) {
        super(cutomerId, cutomerName);
        customerGrade= "GOLD";
        salesRatio = 0.1;
        bonusRatio = 0.02;
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price*salesRatio);
    }
}
