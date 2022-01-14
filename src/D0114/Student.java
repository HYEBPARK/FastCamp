package D0114;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject(name, score);
        subjects.add(subject);
    }

    public void showStudentInfo(){
        int sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getScore();
            System.out.println("학생 " + name + "의 " + subject.getSubjectName() + "과목 성적은 " + subject.getScore() + "입니다.");
        }
        System.out.println("학생 "+name+"의 총점은 "+sum+"입니다.");
    }

}
