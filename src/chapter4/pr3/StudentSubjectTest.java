package chapter4.pr3;

public class StudentSubjectTest {
    public static void main(String[] args) {

    Student studentLee = new Student(1001,"Lee");
    studentLee.addSubject("국어",100 );
    studentLee.addSubject("수학",50 );

    Student studentKim = new Student(1001,"Kim");
    studentKim.addSubject("국어",70 );
    studentKim.addSubject("수학",85 );
    studentKim.addSubject("영어",100 );

    studentLee.showStudentInfo();
        System.out.println("--------------------");
    studentKim.showStudentInfo();
    }
}