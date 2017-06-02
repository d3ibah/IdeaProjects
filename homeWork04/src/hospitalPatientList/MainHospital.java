package hospitalPatientList;

import java.util.Scanner;

public class MainHospital {

    public static void main(String[] args) {
        String fioOrAge;

        Patient[] arrayPatient = new Patient[3];    // Задали массив на 3 элемента

        arrayPatient[0] = new Patient();            // Зачем сделали эти действия я не знаю. постараюсь не забыть спросить.
        arrayPatient[1] = new Patient();            // Делал по аналогии с тем что было на лекции про студентов.
        arrayPatient[2] = new Patient();


        Scanner scanner = new Scanner(System.in);               // создали переменную сканер с типом данных Сканер и определили что это будет новое значение класса Сканер.
        System.out.println("Введите фамилию пациента");         // Верно?
        arrayPatient[0].nameFIO = scanner.nextLine();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        arrayPatient[0].age = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз пациента");
        arrayPatient[0].diagnosis = scanner.next();             // почему-то .nextLine() не хотело работать - после "Введите диагноз пациента"
        //Scanner scanner = new Scanner(System.in);             // сразу шло "Это повторное..." без возможности ввести в консоль значение.
        System.out.println("Это повторное обращение? Напишите true или false");
        arrayPatient[0].isIllAgain = scanner.nextBoolean();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию пациента");
        arrayPatient[1].nameFIO = scanner.next();               // поэтому вместо .nextLine() наугад использовал next(). Вроде сработало
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        arrayPatient[1].age = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);             // !!! я не знаю почему мы не пишем эту строчку каждый  раз
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
        fioOrAge = scanner.next();                                                  // этой переменной присваиваем значение которое вводится в консоль
        System.out.println("По вашему запросу найдены следующие пациенты:\n");
        for (int i = 0; i < arrayPatient.length; i++){                              // в цикле идет перебор для сравнения введенного значения с имеющимися
            if (arrayPatient[i].nameFIO.equals(fioOrAge)) {                         // поскольку сравниваем текстовые значения используем EQUALS
                System.out.println("Фамилия " + arrayPatient[i].nameFIO + ", возраст " + arrayPatient[i].age);
            }
            if (arrayPatient[i].getStringAge().equals(fioOrAge)) {                  // чтобы сравнить int age с текстовым значением сканера, я в классе Patient создал метод приведения int в String
                System.out.println("Фамилия " + arrayPatient[i].nameFIO + ", возраст " + arrayPatient[i].age);
            }
        }



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