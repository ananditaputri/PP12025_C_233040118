package Pertemuan3;

public class Test2 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        // Tambah elemen di awal (head)
        list.addHead(5);
        list.addHead(4);
        list.addHead(3);

        // Tampilkan elemen list
        System.out.print("Elemen: ");
        list.displayElement();
    }
}
