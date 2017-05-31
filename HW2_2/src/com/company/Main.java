package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
В результате выполнения программы на экран должно вывести:
[3] - повторений 2
[7] - повторений 3  */
        float[] mas = {28,15,28,11,28,78,28,55,11,28};
        int count = 1;
        for (int i = 0; i < mas.length; i++){
            for (int j = i + 1; j < mas.length; j++){
                if (mas[i] == mas[j]) {
                        count++;
                }
            }
            if (count > 1){
                System.out.println("Число " + mas[i] + " встречается " + count + " раз");
            }
        }




        /*float[] m2 = new float[massive2.length];
        int countZero = 0;
        int countZeroNew = 0;
        for (int i = 0; i < (massive2.length); i++) {
            if (massive2[i] == 0) {
                countZero++;
            }
            for (int j = i; j < (massive2.length - 1); j++) {
                if (massive2[i] == massive2[j + 1]) {
                    m2[i] = massive2[i];
                    m2[j + 1] = massive2[j+1];
                }
            }
        }
        for (int i = m2.length - 1; i >= 0; i--) {
            //System.out.println(m2[i]);
            Arrays.sort(m2);
            if (m2[i] == m2[i-1]){

            }
            System.out.println(m2[i]);
            if (m2[i] == 0) {
                countZeroNew++;
            }

            }
        if (countZeroNew - countZero != 0) {
            System.out.println("Число Нуль встречается " + countZero + " раз");
        } */

    }
}
