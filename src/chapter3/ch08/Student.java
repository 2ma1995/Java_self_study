package chapter3.ch08;

public class Student {
   private final int studentId;
   private String studentName;

    Subject korean;
    Subject math;

    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;

        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        korean.subjectName = name;
        korean.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore() {
        int total = korean.score + math.score;
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }

//        private로 getStudentId를 숨겼을경우 Id를조회할때
    public int getStudentId(){
        return studentId;
    }
//      private를 사용했을때, 이름을 변경하는 방법
    public void setStudentName(String name){
        this.studentName = name;
    }
}
