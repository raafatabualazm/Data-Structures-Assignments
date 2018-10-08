package com.raafat;

public class Main {

    public static void main(String[] args) {
	    int[] myArr = {3, 1, 5, 6};
		for (int i =0; i < myArr.length; i++){
			System.out.print(myArr[i]);
		}
		System.out.println();
	    IntVector myManipulator = new IntVector(myArr);
	    myArr = myManipulator.insertElement(5, 8);
		myArr = myManipulator.insertElement(7, 9);
	   	myArr = myManipulator.deleteElement(2);
		for (int i =0; i < myArr.length; i++){
			System.out.print(myArr[i]);
		}
		System.out.println();
    }
}
