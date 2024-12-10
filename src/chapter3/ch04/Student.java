package chapter3.ch04;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;

    public Student(){}

    public Student(int id,String name,String studentAddress){
//        this.studentId = studentId; 이렇게 사용
        studentId = id;
        studentName = name;
        this.studentAddress = studentAddress;
    }

    public void showStudentInfo(){
        System.out.println(studentId+ "," + studentName + "," + studentAddress);
//        System.out.println();
    }

    public String getStudentName(){
        return studentName;
    }
}
