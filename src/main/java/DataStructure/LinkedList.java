package DataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }


    public void getHead() {
        if(this.head == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Tail: " + tail.data);

        }
    }

    public void getLength() {
        System.out.println("Length "+ this.length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    //Metodo de Print
    public void print(){
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }






  public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.getHead();
        list.getTail();
        list.getTail();
        list.print();
    }
}
