package Pertemuan3;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Menambahkan elemen di akhir list
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        // Menampilkan elemen list
        System.out.print("Elemen: ");
        list.displayElement();
    }
}

