package chapter3.ch14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");


        Employee employeeKim = new Employee();
        employeeLee.setEmployeeName("김유신");
//        employeeKim.serialNum++;

//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);

        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
        System.out.println(Employee.getSerialNum());
    }
}
