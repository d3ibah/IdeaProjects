package file;

import java.io.*;

public class Main {

    Student[] student = new Student[3];

    public static void main(String[] args) throws FileNotFoundException{

        String fileName = ("D:\\Stud.txt");
        Main main = new Main();
        for (int i = 0; i < main.student.length; i++) {
            main.student[i] = new Student();
        }
        main.read(fileName);
        for (int i = 0; i < main.student.length; i++) {
            System.out.println("Имя:" + main.student[i].getName() + " Возраст:" + main.student[i].getAge() + " Заочник:" + main.student[i].getZaochnik());
        }
    }

    public void read(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));         //Объект для чтения файла в буфер
            try {
                String line;
                int i = 0;
                while ((line = in.readLine()) != null) {
                    String[] strArray = line.split("\\|");
                    student[i].setName(strArray[0]);
                    student[i].setAge(Integer.parseInt(strArray[1]));
                    student[i].setZaochnik(Boolean.parseBoolean(strArray[2]));
                    i++;
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

}