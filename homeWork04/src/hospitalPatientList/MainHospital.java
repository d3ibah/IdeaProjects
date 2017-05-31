package hospitalPatientList;

import java.util.Scanner;

public class MainHospital {

    public static void main(String[] args) {
        String textt;

        Patient[] arrayPatient = new Patient[3];

        arrayPatient[0] = new Patient();
        arrayPatient[1] = new Patient();
        arrayPatient[2] = new Patient();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию пациента");
        arrayPatient[0].nameFIO = scanner.nextLine();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        arrayPatient[0].age = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз пациента");
        arrayPatient[0].diagnosis = scanner.next();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Это повторное обращение? Напишите true или false");
        arrayPatient[0].isIllAgain = scanner.nextBoolean();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию пациента");
        arrayPatient[1].nameFIO = scanner.next();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        arrayPatient[1].age = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз пациента");
        arrayPatient[1].diagnosis = scanner.next();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Это повторное обращение? Напишите true или false");
        arrayPatient[1].isIllAgain = scanner.nextBoolean();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию пациента");
        arrayPatient[2].nameFIO = scanner.next();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        arrayPatient[2].age = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз пациента");
        arrayPatient[2].diagnosis = scanner.next();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Это повторное обращение? Напишите true или false");
        arrayPatient[2].isIllAgain = scanner.nextBoolean();

        System.out.println("Вы ввели данные следующих пациентов:\n" + "Фамилия " + arrayPatient[0].nameFIO + ", возраст " + arrayPatient[0].age
                + "\n" + "Фамилия " + arrayPatient[1].nameFIO + ", возраст " + arrayPatient[1].age
                + "\n" + "Фамилия " + arrayPatient[2].nameFIO + ", возраст " + arrayPatient[2].age
                + "\n");

        System.out.println("Для поиска пациента вы можете ввести его фамилию или возраст:");



        //System.out.println("ФИО " + patient.nameFIO);
        //System.out.println("ФИО " + arrayPatient[0].nameFIO);

    }
}

/*
1) Вам необходимо создать программу с 1-м собственным объектом (классом):
Пациент (то что мы сделали на занятии, но на примере Студента).
В объекте вам нужно описать переменные характерные для данной сущности, например у пациента могут быть переменные ФИО,
возраст, диагноз и тд.
В классе должны быть обязательно переменные типов int, String, boolean.

Далее в основном классе(файле) вы должны создать минимум 3 объекта Пациента  и заполнить их данными из консоли
(ввод данных сделать в красивом виде).

После ввода данных вы должны вывести данные на экран в следующем виде:
Пациент “ФИО” - Возраст = “возраст”

Далее вы должны дать пользователю возможность найти пациента по фамилии и по возрасту. Тоесть в консоли должно
появится предложение найти пользователя по ФИО или по возрасту, далее пользователь вводит нужное имя, далее программа
отображает всех пациентов с данным именем (тоже самое сделать для возраста).

 */