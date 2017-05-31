package hospitalPatientList;

public class Patient {
    public String nameFIO;
    public int age;
    public String diagnosis;
    public Boolean isIllAgain;


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