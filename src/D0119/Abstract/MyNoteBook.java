package D0119.Abstract;

public class MyNoteBook extends NoteBook{

    @Override
    public void display() {
        System.out.println("내 노트북의 화면이야");
    }

    @Override
    public void typing() {
        System.out.println("내 노트북이 타이핑을해");
    }
}
