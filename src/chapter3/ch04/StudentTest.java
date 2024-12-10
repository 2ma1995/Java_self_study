package chapter3.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
        studentLee.studentAddress = "Seoul";

        Student studentKim = new Student(101,"Kim","NewYork");
//        studentKim.studentAddress = "New York";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();


        System.out.println("studentLee = " + studentLee);
        System.out.println("studentKim = " + studentKim);
    }
}
