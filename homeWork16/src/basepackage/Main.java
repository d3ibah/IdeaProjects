package basepackage;

import java.util.Scanner;

public class Main {
    static Thread thread1 = new HomeThread();
    static Thread thread2 = new HomeThread();

    public static void main(String[] args) {

        thread1.setName("Thread 1: ");
        thread2.setName("Thread 2: ");

        System.out.println("Для старта программы введите слово \"start\".");
        scan();

    }

    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        String strt = "start";
        boolean flag = true;
        while (flag) {
            if (strt.equals(scanner.nextLine())) {
                thread1.start();
                thread2.start();
                flag = false;
            }
            else {
                System.out.println("Для старта программы необходимо ввести слово \"start\". Вы вводите другое слово. Повторите попытку:");
            }
        }

    }

    public static void print10(Thread obj, int a, int b){
        for (int i = a; i <= b; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("--------------");
    }
}

