package pertemuan4TUGAS;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList listA = new StrukturList();
        StrukturList listB = new StrukturList();

        // List A: 2.1 3.4 4.5
        listA.addTail(2.1);
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.print("A. ");
        listA.displayElement();  // Output: 2.1 3.4 4.5

        // List B: 3.4 2.1 1.1 4.5 5.5
        listB.addTail(3.4);
        listB.addMid(2.1, 1);
        listB.addMid(1.1, 2);
        listB.addTail(4.5);
        listB.addTail(5.5);
        System.out.print("B. ");
        listB.displayElement();  // Output: 3.4 2.1 1.1 4.5 5.5
    }
}
