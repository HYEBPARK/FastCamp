package D0114;

public class Subject {
    private String subjectName;
    private int score;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Subject(String subjectName, int score){
        this.subjectName = subjectName;
        this.score = score;
    }
}
