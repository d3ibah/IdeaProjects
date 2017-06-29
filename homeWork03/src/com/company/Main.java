package com.company;

import java.util.Arrays;
import java.util.Collections;
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

Сортировку нужно сделать 3-мя различными способами (на ваш выбор). На следующем занятии необходимо уметь пояснить,
как работает тот или иной тип сортировки, плюсы и минусы каждой из них.

Пока это все ). Постарайтесь за выходные до конца понять, то что мы уже прошли:
массивы, циклы (for, while, do-while), операторы (if, switch) и создание дополнительных методов.
*/
    static Integer[] massive = new Integer[10];

    public static void main(String[] args) {

	scaner();
	sort();

    }
    public static void scaner(){
        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < massive.length; i++) {
            massive[i] = scanner.nextInt();
        }
    }

    public static void sort() {
        // сортировка прямы выбором по убыванию
        for (int i = 0; i < massive.length; i++){
            int biggest = i;
            for (int j = i; j < massive.length; j++){
                if (massive[biggest] < massive[j]){
                    biggest = j;
                }
            }
            int t = massive[biggest];
            massive[biggest] = massive[i];
            massive[i] = t;
        }
        output();
        // сортировка по возрастанию
        Arrays.sort(massive);
        output();

        //сортировка по убыванию
        Arrays.sort(massive, Collections.reverseOrder());
        output();

        //пузырьковая сортировка по возрастанию
        for (int i = massive.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (massive[j] > massive[j + 1]){
                    Integer t = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = t;
                }
            }
        }
        output();
    }

    public static void output(){
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
        System.out.println("Конец сортировки------");
    }
}
