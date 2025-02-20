package Pertemuan3;

public class Test1 {
    public static void main(String[] args) {
        // Tes-a: Output 3 2 1
        StrukturList listA = new StrukturList();
        listA.addTail(3);
        listA.addTail(2);
        listA.addTail(1);
        System.out.print("A. ");
        listA.displayElement(); // Output: 3 2 1

        System.out.println();

        // Tes-b: Output 1 4 5 7
        StrukturList listB = new StrukturList();
        listB.addTail(1);
        listB.addTail(4);
        listB.addTail(5);
        listB.addTail(7);
        System.out.print("B. ");
        listB.displayElement(); // Output: 1 4 5 7
    }
}

