package com.company;

public class Main {

    public static void Exampl_2(String[] args) {
        float[] arr = {2, 3, 3, 4, 15, 15, 2, 15, 15, 2};
        float[] dupl = new float[arr.length];                   //создраем массив где будет храниться количество повторов
            for (int i = 0; i < arr.length; i++) {              //перебираем весь массив
                int count = 1;                                  //переменная количества повторов
                float n = arr[i];                                 //элемент массива
                boolean needToCheck = true;                     //флаг нужно ли проверять этот элементе - небыл ли он уже провенер ранее
                for (int k = 0; k < i; k++) {                   //перебираем массив от первого элемента до текущего и если ранее есть элемент
                    if (arr[k] == n) {                          // с таким же значением - ставим флаг в false чтобы не заносить в массив повторов
                        needToCheck = false;                    // значение еще раз
                    }
                }
                if (needToCheck)                                //если такого значение ранее не было
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == n) {
                            count++;
                        }
                        if (j == arr.length -1) {
                            dupl[i] = count;
                            count = 0;
                        }
                    }

            }
            for (int i = 0; i < arr.length; i++) {              //выводим результат
                if (dupl[i] > 1) {
                    System.out.println(arr[i] + " - dupl count: " + dupl[i]);
                }
            }
    }
}
