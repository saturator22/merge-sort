package com.codecool;

public class MergeSort {

    public void mergeSort(int[] arrayToSort) {
        int left = 0;
        int right = arrayToSort.length - 1;
        divide(arrayToSort, left, right);
    }

    private void merge(int[] arrayToSort, int leftEnd, int mid, int rightEnd) {
       int sizeLeft = mid - leftEnd + 1;
       int sizeRight = rightEnd - mid;

       int[] leftPart = new int[sizeLeft];
       int[] rightPart = new int[sizeRight];

       for(int i = 0; i < sizeLeft; i++) {
           leftPart[i] = arrayToSort[leftEnd + i];
       }
       for(int j = 0; j < sizeRight; j++) {
           rightPart[j] = arrayToSort[mid + j + 1];
       }

       int i = 0;
       int j = 0;

       int currentIndex = leftEnd;

       while(i < sizeLeft && j < sizeRight) {
           if(leftPart[i] <= rightPart[j]) {
               arrayToSort[currentIndex] = leftPart[i];
               i++;
           } else {
               arrayToSort[currentIndex] = rightPart[j];
               j++;
           }
           currentIndex++;
       }

       while(i < sizeLeft) {
           arrayToSort[currentIndex] = leftPart[i];
           i++;
           currentIndex++;
       }

       while(j < sizeRight) {
           arrayToSort[currentIndex] = rightPart[j];
           j++;
           currentIndex++;
       }

    }

    private void divide(int[] arrayToSort, int leftEnd, int rightEnd) {
        if(leftEnd < rightEnd) {
            int m = (leftEnd+rightEnd)/2;

            divide(arrayToSort, leftEnd, m);
            divide(arrayToSort, m+1, rightEnd);

            merge(arrayToSort, leftEnd, m, rightEnd);
        }
    }
}
