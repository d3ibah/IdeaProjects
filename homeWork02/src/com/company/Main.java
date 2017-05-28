package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	1. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее
	и наибольшее значение в массиве.
min value =  "значение которое у вас получилось".
max value =  "значение которое у вас получилось".
Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
[23, 0, 34, 99, 43534].*/
	/*
        int[] massive1 = {103,15,28,16,19,78,93,55,11,81};
        int minValue = massive1[1], maxValue = massive1[1], i = 0, nMax = 0, nMin = 0;
        for (i = 0; i<massive1.length; i++){
            if (maxValue < massive1[i]){
                maxValue = massive1[i];
            }
            if (minValue > massive1[i]){
                minValue = massive1[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue + "\n");
        for (i = 0; i < massive1.length; i++) {
            if (maxValue == massive1[i]){
                nMax = i;
            }
            if (minValue == massive1[i]) {
                nMin = i;
            }
        }
        massive1[nMax] = 99;
        massive1[nMin] = 0;
        for (i = 0; i < massive1.length; i++){
            System.out.println(massive1[i]);
        }
        System.out.println("__________________"); */
/*
2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
В результате выполнения программы на экран должно вывести:
[3] - повторений 2
[7] - повторений 3  */
        float[] massive2 = {28,15,28,11,28,78,28,55,11,28};

/*3. Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
второй — с предпоследним и т.д.), и вновь печатает.*/
        int[] massive3 = new int[(int)(Math.random()*10+2)];
        int i3, ii3, k, j3, x;
        int polovinaDlinnyMassiva;
        if (massive3.length % 2 != 0){
            polovinaDlinnyMassiva = (int)(massive3.length / 2 + 1);
        }
        else
            polovinaDlinnyMassiva = massive3.length / 2;
        System.out.println(massive3.length + "   -   " + polovinaDlinnyMassiva);
        for (k = 0; k < massive3.length; k++){
            massive3[k] = (int)(Math.random() * 100);
            System.out.println(massive3[k]);
        }
        for (i3 = 0; i3 < polovinaDlinnyMassiva; i3++){
            x = massive3[i3];
            massive3[i3] = massive3[massive3.length - 1 - i3];
            massive3[massive3.length - 1 - i3] = x;
        }
        for (ii3 = 0; ii3 < massive3.length; ii3++){
            System.out.println(massive3[ii3]);
        }
/*4. Задание не обязательное, для тех кто все сделал и все понимает:
Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию).
Результат вывести на экран.	*/
        int z = (int)(Math.random() * 10 + 1);
        int[] massive4 = new int[z];
        int number;
        for (int i4 = 0; i4 < massive4.length; i4++) {
            massive4[i4] = (int)(Math.random()*100);
            System.out.println(massive4[i4]);
        }
        for (int j = 0; j < z; j++) {
            number = j;
            for (int jj = j; jj < massive4.length; jj++) {
                if (massive4[number] < massive4[jj]) {
                    number = jj;
                }
            }
            int tt;
            tt = massive4[number];
            massive4[number] = massive4[j];
            massive4[j] = tt;
            System.out.println(massive4[j]);
        }


    }
}
