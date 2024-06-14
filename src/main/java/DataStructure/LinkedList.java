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
        System.out.println("#####################");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("#####################");
    }

    //Metodo append
    public void append(String data){
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Metodo remover do final
    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while(pre.next != tail) {
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    //Metodo prepend
    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Metodo remover do inicio
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    //Metodo get
    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }






  public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("Elemento 0");

      System.out.println(list.get(2).data);

     // System.out.println(list.removeFirst().data);
     // list.print();

     /*   list.getHead();
        list.getTail();
        list.getLength();
        list.print();
        */
    }
}
