package org.example;

import DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
       DataStructure.LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.prepend("Elemento 0");

        list.remove(2);
        list.print();

    /*    list.insert(3, "elemento 2.5");

        System.out.println(list.get(2).data);

        System.out.println(list.removeFirst().data);
        list.print();

        list.set(1, "elemento 0.5");
        list.print();

        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
        */
    }
}