package basepackage;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = true;
        boolean change = true;

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новое значение в массивю Для прекращения ввода введите \"stop\"");

        while (stop){                               // создаём коллекцию, в цикле запускаем ввод данных и делаем проверку на кодовое слово по которому осуществим выход из цикла
            String text = scanner.nextLine();
            if (text.equals("stop")){
                stop = false;
                break;
            }
            arrayList.add(text);
        }
        arrayList.trimToSize();
        System.out.println(arrayList.toString());

        for (int i = 0; i < arrayList.size(); i++){     // выполняем поиск символа "а" и его удаление
            String text = arrayList.get(i);
            if (text.contains("a")){
                text = text.replaceAll("a", "");
                arrayList.set(i, text);
            }

        }
        arrayList.trimToSize();
        System.out.println(arrayList.toString());

        HashSet<String> hashSet = new HashSet<>(arrayList); // создаём коллекцию ХэшСэт, которая хранит уникальные значения. Тем самым избавляемся от дублирующихся элементов
        System.out.println(hashSet.toString());


        HashMap<String, People[]> hashMap = new HashMap<>();
        People[] men = new People[3];
        for (int i = 0; i < men.length; i++){
            men[i] = new People();
        }
        men[0].setFname("Aflek");
        men[0].setIname("Alex");
        men[0].setOname("Arsenevich");

        men[1].setFname("Bonaventura");
        men[1].setIname("Boris");
        men[1].setOname("Bronislavovich");

        men[2].setFname("Vandam");
        men[2].setIname("Valeriy");
        men[2].setOname("Vladimirovich");

        People[] women = new People[3];
        for (int i = 0; i < women.length; i++){
            women[i] = new People();
        }

        women[0].setFname("Armagedon");
        women[0].setIname("Antonina");
        women[0].setOname("Abramovna");

        women[1].setFname("Barmaley");
        women[1].setIname("Barbara");
        women[1].setOname("Britowna");

        women[2].setFname("Valkiri");
        women[2].setIname("Vera");
        women[2].setOname("Veronikovna");

        hashMap.put("men", men);
        hashMap.put("women", women);

        Scanner scan = new Scanner(System.in);
        boolean b = true;
        String key = new String();

        while (b) {
            System.out.println("Введите men или women");
            key = scan.next();
            if (key.equals("men") || key.equals("women")) {
                b = false;
            }
        }
        int i = (int) (Math.random() * 3);
        System.out.println(hashMap.get(key)[i].getFname());
        System.out.println(hashMap.get(key)[i].getIname());
        System.out.println(hashMap.get(key)[i].getOname());
    }
}
