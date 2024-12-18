package chapter5.ch04;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    return price - (int) (price*salesRatio);
    }

    public int getAgentID(){
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" 상담원 아이디는 "+ agentID;
    }
}
