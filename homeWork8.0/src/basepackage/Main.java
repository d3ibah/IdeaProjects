package basepackage;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    private Student[] student;
    private int sumStudent;                 // переменная для размера массива

    public static void main(String[] args) throws ParseException {

        Main main = new Main();
        main.sumStudent();                  // вызываем методы объекта Main
        main.firstName();
        main.lastName();
        main.birthdayDate();
        main.sredniyVozrast();
        main.dateE();                        // вызываем метод задачи №3
        main.dateConvertor();                // вызываем метод задачи №4
    }

    private Scanner scanner = new Scanner(System.in);

    public void sumStudent() {
        do {
            System.out.println("Укажите цифрами сколько студентов будет в списке:");

            while (!scanner.hasNextInt()) {
                System.out.println("Произошла ошибка. Возможно вы ввели знаки не являющиеся цифрами. Повторите ещё раз:");
                scanner.next();
            }
            sumStudent = scanner.nextInt();

        } while (sumStudent <= 0);
        scanner.nextLine();

        student = new Student[sumStudent];

        for (int i = 0; i < sumStudent; i++) {
            student[i] = new Student();
        }
    }

    public void firstName() {
        for (int i = 0; i < sumStudent; i++) {
            System.out.println("Введите имя студента №" + (i + 1) + ":");
            student[i].setFistName(scanner.nextLine());
        }
    }

    public void lastName() {
        for (int i = 0; i < sumStudent; i++) {
            System.out.println("Введите фамилию студента №" + (i + 1) + ":");
            student[i].setLastName(scanner.nextLine());
        }
    }

    public void birthdayDate() throws ParseException {
        System.out.println("Введите дату рождения согласно примеру: 25.05.1999");
        for (int i = 0; i < sumStudent; i++) {
            System.out.println("Студент №" + (i + 1) + ":");
            student[i].setBirthdayDate(scanner.nextLine());
        }
    }

    public void sredniyVozrast() {

        long sredniyVozrast;
        long vozrast = 0;
        for (int i = 0; i < sumStudent; i++) {

            Date today = new Date();
            vozrast += (today.getTime() - student[i].getBirthdayDate().getTime());
        }

        sredniyVozrast = vozrast / sumStudent;
        Date averAge = new Date(sredniyVozrast);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(averAge);
        System.out.println("Средний возраст студентов:");
        System.out.println(calendar.get(Calendar.YEAR) - 1970 +
                godGodaLet(calendar.get(Calendar.YEAR) - 1970, " год ", " года ", " лет "));
    }

    public static String godGodaLet(int year, String str1, String str2, String str3) {
        int y10 = year % 10;
        int y100 = year % 100;
        if (y10 == 1 && y100 != 11) {
            return str1;
        } else if (y10 >= 2 && y10 <= 4 && (y100 < 12 || y100 > 14)) {
            return str2;
        } else {
            return str3;
        }
    }

        // Задача №3 Необходимо вывести в консоль текущую дату в виде: Июнь 5е, 9:00 PM

    public void dateE(){
        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat();
        sf.applyPattern("MMMMM d'e', h:mm a");
        String dateString = sf.format(date);

        System.out.println(dateString);

    }

        // Задача №4 Необходимо конвертировать дату из строки в объект Date.
        // Тоесть сроку вида: “2017-06-05 20:25” необходимо конвертировать в объект Date.

    public void dateConvertor(){
        Date date = new Date();
        String stringDate = "2017-06-05 20:25";
        SimpleDateFormat sd3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            date = sd3.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }


}