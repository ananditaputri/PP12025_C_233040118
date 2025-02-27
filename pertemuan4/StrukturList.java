package pertemuan4;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Menambahkan elemen di akhir list (tail)
    public void addTail(int data) {
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

    // Menambahkan elemen di awal list (head)
    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Menambahkan elemen di tengah list (middle)
    public void addMid(int data, int index) {
        if (index <= 0) {  // Jika index <= 0, tambahkan di awal
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;

        for (int i = 1; curNode != null && i < index - 1; i++) {
            curNode = curNode.getNext();
        }

        if (curNode == null || curNode.getNext() == null) {  
            addTail(data); // Jika index di luar jangkauan, tambahkan di akhir
        } else {
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
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
