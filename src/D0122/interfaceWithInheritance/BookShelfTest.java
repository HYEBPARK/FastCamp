package D0122.interfaceWithInheritance;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("나의 라임 오렌지 포도 나무");
        bookQueue.enQueue("지금은 12시 33분");
        bookQueue.enQueue("책 제목임");
        bookQueue.enQueue("잠온다");
        bookQueue.enQueue("인터페이스 좋네");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println("책을 꺼내고 난 후 : "+bookQueue.getSize());
    }
}
