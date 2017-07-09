package ArrayCopy;

import java.util.Arrays;

/**
 * Created by Home911 on 09.07.2017.
 */
public class Main {
    public static void main(String[] args){
        int[] array1 = new int[10];
        int[] array2 = new int[20];
        int halfArray;

        Arrays.fill(array1, 2);
        System.out.println("Массив array1 содержит следующие значения: \n" + Arrays.toString(array1));
        Arrays.fill(array2, 1);
        System.out.println("Массив array2 содержит следующие значения: \n" + Arrays.toString(array2));

        int[] sumArrays = new int[array1.length + array2.length];
        halfArray = array2.length / 2;

        System.arraycopy(array2, 0, sumArrays, 0, halfArray);
        System.arraycopy(array2, halfArray, sumArrays, (array1.length + halfArray), array2.length - halfArray);

        System.out.println("Массив sumArrays после добавления в него array2: \n" + Arrays.toString(sumArrays));

        System.arraycopy(array1, 0, sumArrays, (array2.length / 2), array1.length);

        System.out.println("Итоговый результат сложения массивов: \n" + Arrays.toString(sumArrays));

    }
}
