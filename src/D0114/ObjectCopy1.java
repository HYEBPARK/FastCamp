package D0114;

// 얕은 복사 Shallow Copy
// 주소 값을 참조 => 원본값을 변경하면 copy 값도 변경된다.

public class ObjectCopy1 {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("첫번째 책","박혜빈일");
        library[1] = new Book("두번째 책","박혜빈이");
        library[2] = new Book("세번째 책","박혜빈삼");
        library[3] = new Book("네번째 책","박혜빈사");
        library[4] = new Book("오번째 책","박혜빈오");

        library[0].setTitle("바꾼책");
        library[0].setAuthor("바꾼책 저자");
        System.arraycopy(library,0,copyLibrary,0,5);

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
