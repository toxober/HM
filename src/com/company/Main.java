
package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

            int[] numbers = new int[10];

            Random random = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(10);

                System.out.println(numbers[i]);
            }
        }
    }