package chapter5.ch02;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCutomerName("이순신");
        customerLee.setCutomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCutomerName("김유신");
        customerKim.setCutomerId(10020);
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
