package chapter5.ch03;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

//    public VIPCustomer(){
//        customerGrade = "VIP";
//        salesRatio = 0.05;
//        bonusRatio = 0.1;
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerId, String customerName){
        super(customerId,customerName);
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
        System.out.println("VIPCustomer(int,String) call");

    }



    public int getAgentID(){
        return agentID;
    }

}
