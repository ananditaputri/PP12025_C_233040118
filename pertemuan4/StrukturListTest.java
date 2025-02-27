package pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(3);  // List: 3
        list.addTail(4);  // List: 3 -> 4
        list.addMid(7, 2); // List: 3 -> 7 -> 4
        list.addMid(8, 2); // List: 3 -> 8 -> 7 -> 4
        list.addHead(5);  // List: 5 -> 3 -> 8 -> 7 -> 4

        list.displayElement(); // Output: 5 3 8 7 4
    }
}
