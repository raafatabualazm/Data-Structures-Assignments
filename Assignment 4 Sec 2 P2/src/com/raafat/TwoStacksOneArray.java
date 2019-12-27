package com.raafat;

public class TwoStacksOneArray {
    int size, top1, top2;
    int[] theArray;
    public TwoStacksOneArray(int sz) {
        size = sz;


     theArray = new int[size];
     top1 = -1;
     top2 = size;
    }

    void Push1(int data) {
        System.out.println(size);
        if ((top2 - top1) == 1) {
            System.out.println("Can't Push. Stack is full");
            return;
        }
        theArray[++top1] = data;

    }
    void Push2(int data) {
        if ((top2 - top1) == 1) {
            System.out.println("Can't Push. Stack is full");
            return;
        }
        theArray[--top2] = data;

    }
    int Pop1() {
        if (top1 == -1) {
            System.out.println("Can't Pop. Stack is Empty");
            return top1;
        }
        return theArray[top1--];
    }
    int Pop2() {
        if (top2 == size) {
            System.out.println("Can't Pop. Stack is Empty");
            return top2;
        }
        return theArray[top2++];

    }


}
