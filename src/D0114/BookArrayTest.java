package D0114;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("첫번째 책","박혜빈일");
        library[1] = new Book("두번째 책","박혜빈이");
        library[2] = new Book("세번째 책","박혜빈삼");
        library[3] = new Book("네번째 책","박혜빈사");
        library[4] = new Book("오번째 책","박혜빈오");

        for (Book i : library) {
            System.out.println(i); // 주소값
            i.showBookInfo(); // title, author 출력
        }

    }
}
