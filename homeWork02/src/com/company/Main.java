package com.company;

public class Main {

    public static void main(String[] args) {
        Exampl_1();
        Exampl_2();
        Exampl_3();
        Exampl_4();

    }

    public static void Exampl_1() {
/* 1. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее
и наибольшее значение в массиве.
min value =  "значение которое у вас получилось".
max value =  "значение которое у вас получилось".
Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
[23, 0, 34, 99, 43534].*/
        int[] massive1 = {103, 15, 28, 16, 19, 78, 93, 55, 11, 81};
        int minValue = massive1[1], maxValue = massive1[1], i = 0, nMax = 0, nMin = 0; // можно ли прописывать переменные в одну строку?
        for (i = 0; i < massive1.length; i++) {     // Перебераем весь массив и ищем самое большое значение
            if (maxValue < massive1[i]) {
                maxValue = massive1[i];
            }
            if (minValue > massive1[i]) {           // Перебераем весь массив и ищем самое маленькое значение
                minValue = massive1[i];
            }
        }
        System.out.println("maxValue: " + maxValue);
        System.out.println("mixValue: " + minValue + "\nМассив:");
        for (i = 0; i < massive1.length; i++) {
            if (maxValue == massive1[i]) {          // Перебераем весь массив и ищем адрес самого большого значения
                nMax = i;
            }
            if (minValue == massive1[i]) {          // Перебераем весь массив и ищем адрес самого маленького значения
                nMin = i;
            }
        }
        massive1[nMax] = 99;                        // меняем значение
        massive1[nMin] = 0;
        for (i = 0; i < massive1.length; i++) {     // выводим в консоль массив с изменениями
            System.out.println(massive1[i]);
        }
        System.out.println("_______________END");
    }
    public static void Exampl_2() {
/*2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
В результате выполнения программы на экран должно вывести:
[3] - повторений 2
[7] - повторений 3  */

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
                System.out.println("[" + arr[i] + "]" + " - повторений: " + dupl[i]);
            }
        }
        System.out.println("___________END");
    }

    public static void Exampl_3() {
/* 3. Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
второй — с предпоследним и т.д.), и вновь печатает.*/
        int[] massive3 = new int[(int) (Math.random() * 10 + 2)];
        int i3, ii3, k, j3, x;
        int polovinaDlinnyMassiva;
        if (massive3.length % 2 != 0) {                                 // не смог справиться с округлением (задал вам вопрос в СЛАК)
            polovinaDlinnyMassiva = (int) (massive3.length / 2 + 1);    // выходил из ситуации через проверку на чётностью. нечетные числа
        } else                                                          // округлялись в меньшую сторону и к ним прибавлялась единица
            polovinaDlinnyMassiva = massive3.length / 2;
        // System.out.println(massive3.length + "   -   " + polovinaDlinnyMassiva); выводил для проверки, чтобы убедиться в правильности подсчетов
        for (k = 0; k < massive3.length; k++) {                         // перебераем массив, чтобы заполнить и вывести на консоль
            massive3[k] = (int) (Math.random() * 100);
            System.out.println(massive3[k]);
        }
        for (i3 = 0; i3 < polovinaDlinnyMassiva; i3++) {                // перебераю половину длинны массива, т.к. если перебрать вторую часть,
            x = massive3[i3];                                           // массив вернётся в изначальный вид
            massive3[i3] = massive3[massive3.length - 1 - i3];
            massive3[massive3.length - 1 - i3] = x;
        }
        for (ii3 = 0; ii3 < massive3.length; ii3++) {                   // перебераем массив, чтобы вывести на консоль
            System.out.println(massive3[ii3]);
        }
        System.out.println("___________END");
    }
    public static void Exampl_4() {
/* 4. Задание не обязательное, для тех кто все сделал и все понимает:
Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию).
Результат вывести на экран.	*/
        int z = (int)(Math.random() * 10 + 1);
        int[] massive4 = new int[z];
        int number;
        for (int i4 = 0; i4 < massive4.length; i4++) {          // перебераем массив, чтобы заполнить и вывести на консоль
            massive4[i4] = (int)(Math.random()*100);
            System.out.println(massive4[i4]);
        }
        for (int j = 0; j < z; j++) {
            number = j;
            for (int jj = j; jj < massive4.length; jj++) {      // Находим самое большое число. Его значение, через доп переменную, заносим в первую ячейку,
                if (massive4[number] < massive4[jj]) {          // а значение первой ячейки заносим на бывшее место самого большого значения.
                    number = jj;                                // дальше берём следующее самое большое значение и заносим его во вторую ячейку.
                }                                               // сортировка выполнена по убыванию
            }                                                   // по возрастанию можно было сортировать одной строчкой Arrays.sort(massive4);
            int tt;
            tt = massive4[number];
            massive4[number] = massive4[j];
            massive4[j] = tt;
            System.out.println(massive4[j]);
        }


    }


}

