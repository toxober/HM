package com.company;


public class RemoveFirstElement {
    public static void main(String args[]) {
        int[] FArray = {1, 4, 2 ,0};
        int[] SArray = new int[3];
        System.arraycopy(FArray, 1, SArray, 0, 3);
        int i;
        for (i=0; i<3; i++){
        System.out.print(SArray[i]);
        }
    }
}
