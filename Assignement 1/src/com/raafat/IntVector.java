package com.raafat;

public class IntVector {
    private int[] internalArr;
    private int[] tempArr;
    private int arrLen = 0;
    public IntVector() {
        internalArr = new int[20];
    }
    public IntVector(int[] arr) {
        internalArr = new int[arr.length * 2];
        System.arraycopy(arr,0, internalArr, 0, arr.length);
        arrLen = arr.length;
    }
    public int[] insertElement(int index, int value) {
        if (arrLen + 1 <= internalArr.length) {
            if (index >= arrLen) {
                internalArr[arrLen] = value;
                arrLen++;
            } else {
                System.arraycopy(internalArr, index, internalArr, index + 1, arrLen - index);
                internalArr[index] = value;
                arrLen++;
            }

        }
        else {
            tempArr = new int[internalArr.length * 2];
            System.arraycopy(internalArr, 0, tempArr, 0, internalArr.length);
            internalArr = tempArr;
            insertElement(index, value);
        }
        tempArr = new int[arrLen];
        System.arraycopy(internalArr, 0, tempArr, 0, arrLen);
        return tempArr;
    }
    public int[] deleteElement(int index) {
        System.arraycopy(internalArr, index + 1, internalArr, index, arrLen - index);
        arrLen--;
        tempArr = new int[arrLen];
        System.arraycopy(internalArr, 0, tempArr, 0, arrLen);
        return tempArr;
    }

}
