package com.company;

import java.io.IOException;

public class RemoveFirstElement {
    public static void main(String args[]) throws IOException {
        int[] FArray = new int[4];
        FArray[0]=1;
        FArray[1]=2;
        FArray[2]=3;
        FArray[3]=4;
        int i;
        for(i=0; i<4; i++);
       //System.out.print(FArray[0] + " ");
       while(i<1 && i==0)
           System.out.print(FArray[i]);
        if (i == FArray[0]){
            System.out.print(FArray[i]);
        }else {
            //System.out.print(FArray[i] + " ");
        }

    }
}
