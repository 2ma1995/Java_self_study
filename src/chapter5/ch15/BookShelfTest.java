package chapter5.ch15;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태벡산맥1");
        bookQueue.enQueue("태벡산맥2");
        bookQueue.enQueue("태벡산맥3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
