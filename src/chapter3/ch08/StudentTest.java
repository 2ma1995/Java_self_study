package chapter3.ch08;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(101, "Kim");


        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 95);

        studentKim.setKoreanSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();

//        private로 getStudentId를 숨겼을경우 Id를조회할때
        System.out.println(studentLee.getStudentId());
        System.out.println(studentKim.getStudentId());
//        private로 studentName이 숨겨졌을때, 이름수정할때
        studentKim.setStudentName("James");
        studentKim.showStudentScore();

    }
}
