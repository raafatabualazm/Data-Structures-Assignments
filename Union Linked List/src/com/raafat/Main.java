package com.raafat;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> myLinks = new LinkedList<>();
        linkedlist myList = new linkedlist();
        linkedlist myList2 = new linkedlist();
        linkedlist myList3;
        myList.insertfirst(1);
        myList.insertfirst(2);
        myList.insertfirst(3);
        myList.insertfirst(3);
        myList2.insertfirst(2);
        myList2.insertfirst(3);
        myList2.insertfirst(3);
        myList2.insertfirst(6);
        myList3 = myList.getUnion(myList2);
        link curr = myList3.first;
        while (curr != null) {
            System.out.println(curr.date);
            curr = curr.next;
        }

    }

}
