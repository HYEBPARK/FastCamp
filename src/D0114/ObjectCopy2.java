package D0114;

// 깊은 복사(Deep copy)
// 객체의 실제 값을 새로운 객체로 복사한다.
// => 메모리 측면에서는 비효율적일 수 있다.

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("첫번째 책","박혜빈일");
        library[1] = new Book("두번째 책","박혜빈이");
        library[2] = new Book("세번째 책","박혜빈삼");
        library[3] = new Book("네번째 책","박혜빈사");
        library[4] = new Book("오번째 책","박혜빈오");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i <library.length ; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }



        library[0].setTitle("바꾼책");
        library[0].setAuthor("바꾼책 저자");

        System.out.println("======= 원본 ======");
        for (Book i : library) {
            System.out.println(i); // 주소값
            i.showBookInfo(); // title, author 출력
        }

        System.out.println("======= 복사 ======");
        for (Book i : copyLibrary) {
            System.out.println(i); // 주소값
            i.showBookInfo(); // title, author 출력
        }
    }
}
