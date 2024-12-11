package chapter5.ch09;

public class ComputerTest {
    public static void main(String[] args) {

        Computer deskTop = new DeskTop();
        deskTop.display();
        deskTop.turnOff();

        NoteBook myNoTeBook = new MyNoteBook();
        myNoTeBook.typing();
    }
}
