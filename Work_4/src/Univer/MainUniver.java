package Univer;

public class MainUniver {


        public static void main (String[]args){

            System.out.println();
            Student[] arrayStudents = new Student[3];

            // sozdaem studenta

            arrayStudents[0] = new Student();
            arrayStudents[1] = new Student();
            arrayStudents[2] = new Student();

            // zapolniaem studentov dannymi

            arrayStudents[0].age = 10;
            arrayStudents[0].name = "Piotr";
            arrayStudents[0].isZaochnik = true;
            arrayStudents[0].midlOcenka = 5.7;

            arrayStudents[1].age = 17;
            arrayStudents[1].name = "Kolia";
            arrayStudents[1].isZaochnik = false;
            arrayStudents[1].midlOcenka = 10.0;

            arrayStudents[2].age = 20;
            arrayStudents[2].name = "Vania";
            arrayStudents[2].isZaochnik = false;
            arrayStudents[2].midlOcenka = 7.7;

            Student.nameUniver = "Pvt";

            shownameOfStudent(arrayStudents[1]);

        }

    public static void shownameOfStudent(Student student) {
        System.out.println("name of students " + student.name);
        System.out.println("Univer " + student.nameUniver);
        System.out.println("Univer " + Student.nameUniver);
        System.out.println("Midl ocenka " + student.getOcenkaCeloe());
        System.out.println("Univer " + student.getUniverUpper());
    }

}