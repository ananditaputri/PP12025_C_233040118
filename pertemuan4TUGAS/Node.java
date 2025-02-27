package pertemuan4TUGAS;

public class Node {
    private double data;  // Menggunakan double untuk bilangan pecahan
    private Node next;

    /** Inisialisasi atribut node */
    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    /** Setter & Getter */
    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

