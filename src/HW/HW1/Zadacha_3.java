package HW.HW1;

//3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Вместо массива может прийти null (обработать)

import java.util.Arrays;

public class Zadacha_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
//      int[] array1 = null;
        int[] array2 = {0, 2, 3, 4, 6};
        System.out.println(Arrays.toString(arrNew(array1, array2)));
    }

    public static int[] arrNew(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) { // проверка на null
            throw new NullPointerException ("Массив не может быть NULL!");
        }

        if (array1.length != array2.length) { // проверка на длину массива
            throw new ArrayIndexOutOfBoundsException ("Массивы должны быть равной длины!");
        }

        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] - array2[i];
        }
        return newArray;
    }
}
