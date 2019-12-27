package com.raafat;

public class Main {

    public static void main(String[] args) {
	    LinkedList  myLink = new LinkedList();
	    myLink.insertFirst(50);
	    myLink.insertLast(30);
	    myLink.put(4, 80);
	    myLink.put(1, 70);
        myLink.disPlayList();
        System.out.println("After Swap");
	    LinkedList.swap(myLink, 0, 1);
	    myLink.disPlayList();
    }
}
