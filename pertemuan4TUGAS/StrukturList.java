package pertemuan4TUGAS;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Tambah elemen di akhir list (tail)
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Tambah elemen di awal list (head)
    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Tambah elemen di tengah list (middle)
    public void addMid(double data, int index) {
        if (index == 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;
        int count = 0;

        while (curNode != null && count < index - 1) {
            curNode = curNode.getNext();
            count++;
        }

        if (curNode == null) {
            System.out.println("Index di luar jangkauan");
            return;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    // Menampilkan elemen list
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
