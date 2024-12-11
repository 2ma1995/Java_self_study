package chapter5.ch04;

public class Customer {
    protected int cutomerId;
    protected String cutomerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio=0.01;
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return cutomerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는" + bonusPoint+"입니다.";
    }



}
