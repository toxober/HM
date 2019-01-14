package com.company;

import java.lang.*;


public class RemoveDuplicates {
    public static int[] main(String[] args) {
        public void tt() {
            testArray(new int[]{1, 2, 3, 4, 5, 5, 5});
            testArray(new int[]{11, 12, 16, 1, 2, 3, 4});
            testArray(new int[]{3, 3, 3, 3, 3, 3, 3});
            testArray(new int[]{1});
            testArray(new int[]{});
            testArray(new int[]{10, 11, 11, 11, 11, 11, 11});
            testArray(new int[]{1, 1, 2, 2, 3, 3, 4, 4});
        }

        public void testArray ( int[] a){
            Arrays.sort(a);
            a = removeDuplicates(a);
            Arrays.stream(a).forEach(value -> System.out.print(value + " "));
            System.out.println();
        }

        public int[] removeDuplicates ( int[] array){
            //Частные случаи
            if (array.length == 1) return array;
            if (array.length == 0) return new int[0];
            //
            //Размер больше 1, уникальное значение как минимум одно
            int unique = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    unique++; //Если текущий с предыдущим не равны - значит
                    // увеличиваем счетчик уникальных значений
                }
            }
            int[] result = new int[unique]; //Новый массив нужного размера
            int k = 0; //Текущая позиция в новом массиве
            if (result.length > 0) {
                result[k++] = array[0]; //Пишем в новый массив первое уникальное значение
            }
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    result[k++] = array[i]; //Пишем в новый массив остальные уникальные значения
                }
            }
            return result;
        }
    }
}
