package com.company;

import java.util.Scanner;

public class Main {
    /* 1. Создайте массив с 10-ю переменными типа int.
Значения необходимо вводить с клавиатуры в отдельном методе.
Затем выведите все значения на экран также в отдельном методе в виде:
"значение" | "значение 2" | "значение 3" |  и тд. -
Далее отсортируйте массив по возрастанию одним из способов из статьи (или всеми:) ).
Результат вывести на экран:
"значение" | "значение 2" | "значение 3" |  и тд.
Далее найдите в массиве все четные числа и выведите их на экран:
"значение" | "значение 2" | "значение 3" |  и тд.

В итоге у вас должна получиться программа как минимум с 3 методами:
1- для ввода данных с клавиатуры
2 - для сортировки
3 - для вывода

Вывод значений массива на экран должен быть сделан в отдельном методе,
этот метод будет использоваться для вывода значений массива до сортировки и после сортировки.

Сортировку нужно сделать 3-мя различными способами (на ваш выбор). На следующем занятии необходимо уметь пояснить, как работает тот или иной тип сортировки, плюсы и минусы каждой из них.

Пока это все ). Постарайтесь за выходные до конца понять, то что мы уже прошли:
массивы, циклы (for, while, do-while), операторы (if, switch) и создание дополнительных методов.
*/

    public static void main(String[] args) {
        int[] massive = new int[10];
	scaner();
	sort();
	output();
    }
    public static int scaner(){
        Scanner scanner = new Scanner(System.in);
        int[] massiveS = new  int[10];
        for (int i = 0; i < massiveS.length; i++) {
            massiveS[i] = scanner.nextInt();
            int z = massiveS[i];
            return z;
        }


    }

    public static void sort(){

    }

    public static void output(){
        System.out.println();

    }
}
